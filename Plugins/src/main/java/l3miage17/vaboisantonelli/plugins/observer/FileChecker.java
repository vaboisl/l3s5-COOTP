/**
 * 
 */
package l3miage17.vaboisantonelli.plugins.observer;

import java.util.ArrayList;

import java.io.File;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.Timer;

import l3miage17.vaboisantonelli.plugins.file.FileFiltersClassC;

/**
 * @author vabois
 *
 */
public class FileChecker implements ActionListener {
	protected FileFiltersClassC filterContainer;
	protected File dirPath;
	protected Timer timer;
	private ArrayList<FileListener> fileListeners = new ArrayList<FileListener>();
	private ArrayList<String> knownFiles = new ArrayList<String>();
	
	public FileChecker (FileFiltersClassC pFilter, File pPath) {
		this.filterContainer = pFilter;
		this.dirPath = pPath;
		this.timer = new Timer(1000, this);
		this.timer.setRepeats(true);
	}
	
	public synchronized void addFileListener (FileListener pListener) {
		if (this.fileListeners.contains(pListener)) { return ; }
		this.fileListeners.add(pListener);
	}
	
	public synchronized void removeFileListener (FileListener pListener) {
		this.fileListeners.remove(pListener);
	}
	
	private void fireFileAdded (String pFilename) {
		ArrayList<FileListener> fListeners = (ArrayList<FileListener>) this.fileListeners.clone();
		if (fListeners.size() == 0) { return ; }
		FileEvent event = new FileEvent(this, pFilename);
		for (FileListener listener : fListeners) {
			listener.fileAdded(event);
		}
	}
	
	public void addFile (String pFilename) {
		this.fireFileAdded(pFilename);
	}
	
	public void actionPerformed (ActionEvent pActionEvent) {
		String[] classFiles = this.filterContainer.getClassName();
		for (int i = 0; i < classFiles.length; i++) {
			if (! this.knownFiles.contains(classFiles[i])) {
				this.addFile(classFiles[i]);
				this.knownFiles.add(classFiles[i]);
			}
		}
		
	}
	
	public static void main (String[] args) throws InterruptedException {
		FileChecker fc = new FileChecker(new FileFiltersClassC(new File("files")), new File(""));
		FileListener fl = new FileUpdateActor(fc);
		fc.addFileListener(fl);
		fc.timer.start();
		Thread.sleep(15000);
	}
	
}
