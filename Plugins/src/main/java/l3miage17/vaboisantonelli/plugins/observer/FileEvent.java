/**
 * 
 */
package l3miage17.vaboisantonelli.plugins.observer;

/**
 * @author vabois
 *
 */
public class FileEvent extends java.util.EventObject {
	protected String filename;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2964143313155395821L;
	
	public FileEvent (FileChecker pSource, String pFilename) {
		super(pSource);
		this.filename = pFilename;
	}
	
	public String getFilename () {
		return this.filename;
	}
	
}
