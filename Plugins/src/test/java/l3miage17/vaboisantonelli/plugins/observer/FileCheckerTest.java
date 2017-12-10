/**
 * 
 */
package l3miage17.vaboisantonelli.plugins.observer;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.File;

import java.awt.event.ActionEvent;

import l3miage17.vaboisantonelli.plugins.file.FileFiltersClassC;

/**
 * @author vabois
 *
 */
public class FileCheckerTest {
	protected MockFileChecker mfc = new MockFileChecker(new FileFiltersClassC(new File("files")), new File(""));
	protected MockFileListener mfl = new MockFileListener();
	
	
	class MockFileChecker extends FileChecker {
		protected int nbListeners = 0;
		protected int actionPerformedCalls = 0;
		
		public MockFileChecker (FileFiltersClassC pFilter, File pPath) {
			super(pFilter,pPath);
		}
		
		public void addFileListener (FileListener pListener) {
			this.nbListeners += 1;
		}
		
		public void removeFileListener (FileListener pListener) {
			this.nbListeners -= 1;
		}
		
		public void actionPerformed (ActionEvent pActionEvent) {
			this.actionPerformedCalls++;
		}
		
	}
	
	class MockFileListener implements FileListener {
		protected int nbFileAddedRuns = 0;
		protected int nbFileRemovedRuns = 0;
		
		public void fileAdded (FileEvent pEvent) {
			this.nbFileAddedRuns++;
		}
		
		public void fileRemoved (FileEvent pEvent) {
			this.nbFileRemovedRuns++;
		}
		
	}
	
	@Test
	public void testAddFileListenerInUsualConditions () {
		assertTrue(this.mfc.nbListeners == 0);
		this.mfc.addFileListener(new MockFileListener());
		assertEquals(1, this.mfc.nbListeners);
	}
	
	@Test
	public void testRemoveFileListenerInUsualConditions () {
		assertTrue(this.mfc.nbListeners == 0);
		this.mfc.removeFileListener(new MockFileListener());
		assertEquals(-1, this.mfc.nbListeners);
	}
	
	@Test
	public void testTimerCallsToActionPerformed () throws InterruptedException {
		mfc.timer.setRepeats(false);
		assertTrue(mfc.actionPerformedCalls == 0);
		mfc.timer.start();
		Thread.sleep(3000);
		assertEquals(1, mfc.actionPerformedCalls);
	}
	
	@Test
	public void testFileAdditionEventNotifications () {
		FileChecker fc = new FileChecker(new FileFiltersClassC(new File("files")), new File(""));
		fc.addFileListener(this.mfl);
		assertTrue(this.mfl.nbFileAddedRuns == 0);
		fc.addFile("Mock.class");
		assertEquals(1, this.mfl.nbFileAddedRuns);
	}
	
	@Test
	public void testFileRemovalEventNotifications () {
		FileChecker fc = new FileChecker(new FileFiltersClassC(new File("files")), new File(""));
		fc.addFileListener(this.mfl);
		assertTrue(this.mfl.nbFileRemovedRuns == 0);
		fc.removeFile("Mock.class");
		assertEquals(1, this.mfl.nbFileRemovedRuns);
	}
	
}
