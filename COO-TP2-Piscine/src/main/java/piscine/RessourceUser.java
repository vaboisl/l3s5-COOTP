/**
 * 
 */
package piscine;

/**
 * @author vabois
 * 
 */
public abstract class RessourceUser<R> {
	protected R ressource;
	
	public void setRessource (R r) {
		ressource = r;
	}
	
	public R getRessource () {
		return ressource;
	}
	
	public void resetRessource () {
		ressource = null;
	}
	
}
