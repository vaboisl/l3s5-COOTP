/**
 * 
 */
package l3miage17.vaboisantonelli.plugins.observer;

/**
 * @author vabois
 *
 */
public class FileUpdateActor implements FileListener {
	protected FileChecker checker;
	
	public FileUpdateActor (FileChecker pChecker) {
		this.checker = pChecker;
	}
	
	public void fileAdded (FileEvent pEvent) {
		System.out.println("nouveau .class : " + pEvent.getFilename() + " détecté");
	}
	
	public void fileRemoved (FileEvent pEvent) {
		System.out.println(".class  " + pEvent.getFilename() + " supprimé détecté");
	}
	
}
