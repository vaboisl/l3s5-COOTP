/**
 * 
 */
package piscine;

/**
 * @author vabois
 * 
 */
public class CubiclePool implements Ressource {
	protected static int cpt = 0;
	protected int index;
	
	public CubiclePool () {}
	
	public String description () { return "pool cubicle"; }
	
}
