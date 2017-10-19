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
	protected int currentActionPosition;
	
	protected void removeAction (Action a) {
		List<Action> sub = getSubActions();
		sub.remove(sub.indexOf(a));
	}
	
	protected Action nextAction () {
		return null;
	}
	
}
