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
	
	public FairScheduler () {
		super(null);
	}
	
	public FairScheduler (String m) {
		super(m);
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
