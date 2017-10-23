/**
 * 
 */
package action;

import java.util.NoSuchElementException;

import piscine.Ressource;
import piscine.RessourceUser;
import piscine.RessourcePool;

/**
 * @author vabois
 *
 */
public class TakeRessourceAction<R extends Ressource> extends RessourceAction<R> {
	protected boolean done;
	
	public TakeRessourceAction (String m, RessourcePool<R> p, RessourceUser<R> u) {
		super(m,p,u);
	}
	
	protected void reallyDoStep () {
		try {
			System.out.print(" trying to take ressource from ");
			R r = this.pool.provideRessource();
			System.out.println("... success");
			this.user.setRessource(r);
			this.done = true;
		} catch (NoSuchElementException e) {
			System.out.println("... failed");
		}
	}
	
	protected boolean stopCondition () { return this.done; }
	
}
