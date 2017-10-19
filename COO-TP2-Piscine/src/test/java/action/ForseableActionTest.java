/**
 * 
 */
package action;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author vabois
 *
 */
public class ForseableActionTest extends ActionTest {
	
	public Action createAction () {
		return new ForseableAction(15);
	}
	
	@Test
	public void testActionInProgressAfterCallToDoStep () throws ActionFinishedException {
		this.action.doStep();
		assertSame(ActionState.IN_PROGRESS, this.action.getState());
	}
	
}
