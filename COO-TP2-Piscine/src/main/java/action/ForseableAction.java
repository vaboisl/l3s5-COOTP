/**
 * 
 */
package action;

/**
 * @author vabois
 * 
 */
public class ForseableAction extends Action {
	private int waitingTime;
	
	public ForseableAction (int t) { this(null,t); }
	
	public ForseableAction (String m, int t) {
		super(m);
		this.waitingTime = t;
	}
	
	protected void reallyDoStep () {
		this.waitingTime--;
	}
	
	protected boolean stopCondition () {
		return this.waitingTime == 0;
	}
	
}
