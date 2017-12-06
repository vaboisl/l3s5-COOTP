/**
 * 
 */
package l3miage17.vaboisantonelli.plugins.file;

import java.io.File;
import java.io.FilenameFilter;

import l3miage17.vaboisantonelli.plugins.event.CFilenameFilter;
import l3miage17.vaboisantonelli.plugins.event.ClassFilenameFilter;


public class FileFiltersClassC {
	private File dir;
	private FilenameFilter fclass, fc;
	
	public FileFiltersClassC (File pDir) {
		this.dir = pDir;
		this.fclass  = new ClassFilenameFilter();
		this.fc = new CFilenameFilter();
	}
	
	public String[] getClassName() {
		return dir.list(fclass);
	}
	
	public String[] getCName () {
		return dir.list(fc);
	}
	
}
