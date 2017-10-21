/**
 * 
 */
package piscine;

/**
 * @author vabois
 * 
 */
public abstract class RessourceUser<R extends Ressource> {
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
