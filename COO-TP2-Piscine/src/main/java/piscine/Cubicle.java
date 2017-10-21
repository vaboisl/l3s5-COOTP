/**
 * 
 */
package piscine;

/**
 * @author vabois
 *
 */
public class Cubicle implements Ressource {
	protected boolean given;
	
	public Cubicle () {}
	
	public String description () { return "ressource cubicle"; }
	
	public boolean isGiven() {
		return this.given;
	}
	
	public void setStatus (boolean state) {
		this.given = state;
	}
	
}
