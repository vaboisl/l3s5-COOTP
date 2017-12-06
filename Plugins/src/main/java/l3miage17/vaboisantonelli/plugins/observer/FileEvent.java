/**
 * 
 */
package l3miage17.vaboisantonelli.plugins.observer;

/**
 * @author vabois
 *
 */
public class FileEvent extends java.util.EventObject {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2964143313155395821L;
	
	public FileEvent (FileChecker pSource) {
		super(pSource);
	}
	
}
