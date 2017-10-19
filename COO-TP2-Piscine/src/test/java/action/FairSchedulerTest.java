/**
 * 
 */
package action;



/**
 * @author vabois
 *
 */
public class FairSchedulerTest extends SchedulerTest {
	
	public Action createAction () {
		return new FairScheduler();
	}
	
}
