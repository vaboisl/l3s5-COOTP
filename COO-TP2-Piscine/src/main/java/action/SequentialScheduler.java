/**
 * 
 */
package action;

/**
 * @author vabois
 * 
 */
public class SequentialScheduler extends Scheduler {
	
	public SequentialScheduler () {
		super(null);
	}
	
	public SequentialScheduler (String m) {
		super(m);
	}
	
	protected void removeAction () {
		this.getSubActions().remove(0);
	}
	
	protected Action nextAction () {
		return this.getSubActions().get(0);
	}
	
}
