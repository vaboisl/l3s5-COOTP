/**
 * 
 */
package action;

/**
 * @author vabois
 * 
 */
public class ForseableAction extends Action {
	private boolean done = false;
	
	public void reallyDoStep () {
		
	}
	
	public boolean stopCondition () {
		return this.done;
	}
	
}
