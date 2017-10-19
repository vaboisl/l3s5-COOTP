/**
 * 
 */
package piscine;

/**
 * @author vabois
 * 
 */
public class BasketPool implements Ressource {
	protected static int cpt = 0;
	protected int index;
	
	public BasketPool () {}
	
	public String description () {return "pool basket";}
	
}
