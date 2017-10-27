/**
 * Classe de test
 * pour les pool 
 * de ressources
 */
package piscine;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Before;
import org.junit.Test;

/**
 * @author vabois
 * 
 */
public class PoolTest {
	
	/**
	 * MockPool pour les tests
	 **/
	private class MockRessourcePool<R extends Ressource> extends RessourcePool<R> {
		protected int index;
		
		public MockRessourcePool () {
			super();
			this.index = index;
		}
		
		@Override
		public R provideRessource() {
			if (index > 0) {
				for (R r : this.pool) {
					if (r.isGiven() == false) {
						r.setStatus(true);
						this.index--;
						return r;
					}
				}
			} else {
				throw new NoSuchElementException("No available ressource in " + this.description());
			}
			return null;
		}
		
		@Override
		public void recoverRessource(R ress) {
			for (R r : this.pool) {
				if (r==ress) {
					r.setStatus(false);
					this.index++;
					return;
				}
			}
			throw new IllegalArgumentException("Recovered ressource doesn't belong to " + this.description());
		}
		
		public String description () { return "mock pool"; }
		
	}
	
	@Before
	public void init () {
		MockRessourcePool rp = new MockRessourcePool();
	}
	
	
	
}
