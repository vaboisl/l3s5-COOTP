/**
 * 
 */
package l3miage17.vaboisantonelli.plugins.observer;

import java.util.ArrayList;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author vabois
 *
 */
public class FileChecker {
	protected FilenameFilter filter;
	protected File dirPath;
	private ArrayList<FileListener> fileListeners = new ArrayList<FileListener>();
	
	public FileChecker (FilenameFilter pFilter, File pPath) {
		this.filter = pFilter;
		this.dirPath = pPath;
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
	
}
