/**
 * 
 */
package piscine;

/**
 * @author vabois
 *
 */
public class Basket implements Ressource {
	protected boolean given;
	
	public Basket () {}
	
	public String description () { return "ressource basket"; }
	
	public boolean isGiven () {
		return this.given;
	}
	
	public void setStatus (boolean state) {
		this.given = state;
	}
	
}
