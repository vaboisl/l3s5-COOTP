package l3miage17.vaboisantonelli.plugins.file;
import java.io.File;
import java.io.FilenameFilter;

import l3miage17.vaboisantonelli.plugins.event.ClassFilenameFilter;

public class FileFiltersClass {
	private File dir;
	private FilenameFilter fclass, fc;
	
	public FileFiltersClass(File pDir) {
		this.dir = pDir;
		this.fclass  = new ClassFilenameFilter();
		this.fc = new ClassFilenameFilter();
	}
	
	public String[] getClassName() {
		return dir.list(fc);
	}
}
