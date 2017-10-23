/**
 * 
 */
package piscine;

/**
 * @author vabois
 * 
 */
public class RessourceUser<R extends Ressource> {
	protected R ressource;
	protected String name;
	
	public RessourceUser (String name) {
		this.name = name;
	}
	
	public void setRessource (R r) {
		ressource = r;
	}
	
	public R getRessource () {
		return ressource;
	}
	
	public void resetRessource () {
		ressource = null;
	}
	
	protected String getName () {
		return this.name;
	}
	
}
