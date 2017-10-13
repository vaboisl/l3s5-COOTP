/**
 * Classe de test
 * pour les pool 
 * de ressources
 */
package piscine;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * @author vabois
 * @date 05/10/2017
 */
public class PoolTest {
	
	/**
	 * MockPool pour les tests
	 * @date 05/10/2017
	 **/
	private class RessourcePool implements Ressource {
		
		public String description () {return "";}
		
	}
	
	@Before
	public void init () {
		RessourcePool rp = new RessourcePool();
	}
	
	
	
}
