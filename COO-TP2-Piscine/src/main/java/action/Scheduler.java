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
	
	public abstract void addAction (Action a) ;
	
	protected List<Action> getSubActions () {
		return subActions;
	}
	
	public abstract void reallyDoStep () ;
	
	public boolean stopCondition () {
		return subActions.isEmpty();
	}
	
	protected abstract void removeAction (Action a) ;
	
	protected abstract Action nextAction () ;
	
}
