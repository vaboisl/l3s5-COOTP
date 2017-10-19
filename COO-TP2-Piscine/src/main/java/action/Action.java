/**
 * 
 */
package action;

/**
 * @author vabois
 * 
 */
public abstract class Action {
	protected ActionState state;
	protected String msg; /* pour affichage */
	
	public Action () {}
	
	public Action (String msg) {
		this.msg = msg;
	}
	
	public void doStep () throws ActionFinishedException {
		if (this.isFinished()) {
			throw new ActionFinishedException("can't do step when finished!");
		}
		if (this.state == ActionState.READY) {
			this.state = ActionState.IN_PROGRESS;
		}
		if(msg != null)
			System.out.println(msg);
		this.reallyDoStep();
		if(this.stopCondition()) {
			this.state = ActionState.FINISHED;
		}
	}
	
	public boolean isFinished () {
		return this.state == ActionState.FINISHED;
	}
	
	protected abstract void reallyDoStep () ;
	
	protected abstract boolean stopCondition () ;
	
	public ActionState getState () { return this.state; }
	
}
