/**
 * 
 */
package l3miage17.vaboisantonelli.plugins.observer;

import java.util.ArrayList;

import java.io.FilenameFilter;

/**
 * @author vabois
 *
 */
public class FileChecker {
	FilenameFilter filter;
	String filePath;
	private ArrayList<FileListener> fileListeners = new ArrayList<FileListener>();
	
	public FileChecker (FilenameFilter pFilter, String pPath) {
		this.filter = pFilter;
		this.filePath = pPath;
	}
	
	public synchronized void addFileListener (FileListener pListener) {
		if (this.fileListeners.contains(pListener)) { return ; }
		this.fileListeners.add(pListener);
	}
	
	public synchronized void removeFileListener (FileListener pListener) {
		if (this.fileListeners.contains(pListener)) { this.fileListeners.remove(pListener); }
	}
	
	
	
}
