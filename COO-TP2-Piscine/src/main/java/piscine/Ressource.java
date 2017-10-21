/**
 * Interface Ressource
 * pour les pool de ressources
 */
package piscine;

/**
 * @author vabois
 * 
 */
public interface Ressource {
	public String description();
	public boolean isGiven();
	public void setStatus(boolean state);
}
