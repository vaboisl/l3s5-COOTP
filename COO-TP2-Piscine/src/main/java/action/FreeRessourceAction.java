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
public class FreeRessourceAction<R extends Ressource> extends RessourceAction<R> {
	
	public FreeRessourceAction (String m, RessourcePool<R> p, RessourceUser<R> u) {
		super(m,p,u);
	}
	
	protected void reallyDoStep () {
		try {
			this.pool.recoverRessource(this.user.getRessource());
			System.out.println(" freeing ressource from ");
			this.user.resetRessource();
		} catch (InvalidRessourceException e) {
			throw new RuntimeException(e);
		}
	}
	
	protected boolean stopCondition () { return true ; }
	/* La FreeRessourceAction est toujours executee en 1 seul pas... */
	
}
