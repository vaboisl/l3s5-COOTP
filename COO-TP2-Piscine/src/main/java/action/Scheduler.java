/**
 * 
 */
package action;

import java.util.List;

/**
 * @author vabois
 * 
 */
public abstract class Scheduler extends Action {
	private List<Action> subActions;
	
	public Scheduler () {
		super(null);
	}
	
	public Scheduler (String msg) {
		super(msg);
	}
	
	public void addAction (Action a) throws ActionFinishedException {
		if(this.getState()==ActionState.FINISHED)
			throw new ActionFinishedException("can't add action on a finished scheduler!");
		this.getSubActions().add(a);
	}
	
	protected List<Action> getSubActions () {
		return subActions;
	}
	
	protected void reallyDoStep () {
		Action action = this.nextAction();
		try {
			action.doStep();
		} catch (ActionFinishedException e) {
			e.printStackTrace();
		}
		if(action.isFinished()) {
			this.removeAction(action);
		}
	}
	
	public boolean stopCondition () {
		return subActions.isEmpty();
	}
	
	protected abstract void removeAction (Action a) ;
	
	protected abstract Action nextAction () ;
	
}
