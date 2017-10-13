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
	
	public void doStep () {
		this.reallyDoStep();
	}
	
	public abstract void reallyDoStep () ;
	
	public abstract boolean stopCondition () ;
	
}
