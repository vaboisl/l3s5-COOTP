/**
 * 
 */
package piscine;

import java.util.List;

/**
 * @author vabois
 *
 */
public abstract class RessourcePool<R> {
	protected List<R> pool;
	
	public R provideRessource () {
		return null;
	}
	
}
