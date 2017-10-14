/**
 * 
 */
package action;

import java.util.List;

/**
 * @author vabois
 * 
 */
public class FairScheduler extends Scheduler {
	private int currentActionPosition;
	
	public void addAction (Action a) {
		
	}
	
	public void reallyDoStep () {
		
	}
	
	protected void removeAction (Action a) {
		List<Action> sub = getSubActions();
		sub.remove(sub.indexOf(a));
	}
	
	protected Action nextAction () {
		return null;
	}
	
}
