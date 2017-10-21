/**
 * 
 */
package action;

import piscine.Ressource;
import piscine.RessourceUser;
import piscine.RessourcePool;

/**
 * @author vabois
 *
 */
public abstract class RessourceAction<R extends Ressource> extends Action {
	protected RessourceUser<R> user;
	protected RessourcePool<R> pool;
	
	public RessourceAction (String m, RessourcePool<R> p, RessourceUser<R> u) {
		super(m);
		this.pool = p;
		this.user = u;
	}
	
	protected abstract void reallyDoStep () ;
	
	protected abstract boolean stopCondition () ;
	
}
