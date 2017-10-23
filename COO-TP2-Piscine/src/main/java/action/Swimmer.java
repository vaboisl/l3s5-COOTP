/**
 * 
 */
package action;

import piscine.Ressource;
import piscine.BasketPool;
import piscine.CubiclePool;
import piscine.RessourceUser;

/**
 * @author vabois
 *
 */
public class Swimmer<R extends Ressource> extends SequentialScheduler {
	protected String name;
	
	
	public Swimmer (String name, BasketPool<R> bp, CubiclePool<R> cp, int undress, int swim, int dress) throws ActionFinishedException {
		this.name = name;
		this.addAction(new TakeRessourceAction<R>(null,bp,new RessourceUser<R>(name)));
		this.addAction(new TakeRessourceAction<R>(null,cp,new RessourceUser<R>(name)));
		this.addAction(new ForseableAction(undress));
		this.addAction(new ForseableAction(swim));
		this.addAction(new ForseableAction(dress));
		this.addAction(new FreeRessourceAction<R>(null,cp,new RessourceUser<R>(name)));
		this.addAction(new FreeRessourceAction<R>(null,bp,new RessourceUser<R>(name)));
	}
	
	public String getName () {
		return this.name;
	}
	
	protected void reallyDoStep () {
		Action action = this.nextAction();
		if ((action instanceof TakeRessourceAction)||(action instanceof FreeRessourceAction)) {
			System.out.print(" " + this.name);
		}
		try {
			action.doStep();
		} catch (ActionFinishedException e) {
			e.printStackTrace();
		}
		if (action.isFinished()) {
			this.removeAction();
		}
	}
	
}
