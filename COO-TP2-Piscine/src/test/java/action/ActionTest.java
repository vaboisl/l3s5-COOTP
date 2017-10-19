/**
 * 
 */
package action;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * @author vabois
 *
 */
public abstract class ActionTest {
	protected Action action;
	
	public abstract Action createAction () ;
	
	@Before
	public void initAction () {
		this.action = this.createAction();
	}
	
	@Test
	public void testActionInitiallyInReadyState () {
		assertSame(ActionState.READY, this.action.getState());
	}
	
	@Test (expected = ActionFinishedException.class)
	public void testDoStepCalledOnAFinishedActionThrowsException () throws ActionFinishedException {
		while (this.action.isFinished() == false) {
			this.action.doStep();
		}
	}
	
}
