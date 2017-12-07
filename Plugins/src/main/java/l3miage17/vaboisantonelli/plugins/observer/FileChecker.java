/**
 * 
 */
package l3miage17.vaboisantonelli.plugins.observer;

import java.util.ArrayList;

import java.io.File;

import javax.swing.Timer;

import l3miage17.vaboisantonelli.plugins.file.FileFiltersClassC;

/**
 * @author vabois
 *
 */
public class FileChecker {
	protected FileFiltersClassC filterContainer;
	protected File dirPath;
	protected Timer timer;
	private ArrayList<FileListener> fileListeners = new ArrayList<FileListener>();
	
	public FileChecker (FileFiltersClassC pFilter, File pPath) {
		this.filterContainer = pFilter;
		this.dirPath = pPath;
		this.timer = new Timer(1000, new FileUpdateActor(this));
		this.timer.setRepeats(true);
	}
	
	public synchronized void addFileListener (FileListener pListener) {
		if (this.fileListeners.contains(pListener)) { return ; }
		this.fileListeners.add(pListener);
	}
	
	public synchronized void removeFileListener (FileListener pListener) {
		this.fileListeners.remove(pListener);
	}
	
	private void fireFileAdded () {
		ArrayList<FileListener> fListeners = (ArrayList<FileListener>) this.fileListeners.clone();
		if (fListeners.size() == 0) { return ; }
		FileEvent event = new FileEvent(this);
		for (FileListener listener : fListeners) {
			listener.fileAdded(event);
		}
	}
	
	public void addFile () {
		this.fireFileAdded();
	}
	
	public static void main (String[] args) throws InterruptedException {
		FileChecker fc = new FileChecker(new FileFiltersClassC(new File("")), new File(""));
		fc.timer.start();
		Thread.sleep(5000);
	}
	
}
