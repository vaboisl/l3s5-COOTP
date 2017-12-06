/**
 * 
 */
package l3miage17.vaboisantonelli.plugins.event;

import java.io.File;
import java.io.FilenameFilter;


public class CFilenameFilter implements FilenameFilter {
	
	public boolean accept (File dir, String filename) {
		return filename.startsWith("C");
	}
	
}
