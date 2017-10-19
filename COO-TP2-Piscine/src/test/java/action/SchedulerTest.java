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
public abstract class SchedulerTest extends ActionTest {
	
	public abstract Action createAction () ;
	
	@Test
	public void testSubActionsCorrectlyRemovedWhenShedulerIsFinished () throws ActionFinishedException {
		this.action.doStep();
		assertSame(ActionState.FINISHED, this.action.getState());
		//assertTrue(this.action.getSubActions().size()==0);
	}
	
	// testAddActionOnAlreadyStartedShedulerThrowsException ???
	
}
