/**
 * 
 */
package action;

import java.util.List;

import piscine.Ressource;

/**
 * @author vabois
 * 
 */
public class FairScheduler<R extends Ressource> extends Scheduler {
	protected int currentActionPosition;
	
	public FairScheduler () {
		super(null);
	}
	
	public FairScheduler (String m) {
		super(m);
	}
	
	protected void reallyDoStep () {
		Swimmer<R> action = (Swimmer<R>)(this.nextAction());
		System.out.println(action.getName() + "'s turn");
		try {
			action.doStep();
		} catch (ActionFinishedException e) {
			e.printStackTrace();
		}
		if (action.isFinished()) {
			this.removeAction();
		}
	}
	
	protected void removeAction () {
		List<Action> sub = getSubActions();
		sub.remove(sub.indexOf(currentActionPosition));
	}
	
	protected Action nextAction () {
		if (currentActionPosition == this.getSubActions().size()-1) {
			currentActionPosition = 0;
			return this.getSubActions().get(this.getSubActions().size()-1);
		} else {
			currentActionPosition++;
			return this.getSubActions().get(currentActionPosition-1);
		}
	}
	
}
