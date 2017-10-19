/**
 * 
 */
package action;



/**
 * @author vabois
 *
 */
public class SequentialSchedulerTest extends SchedulerTest {
	
	public Action createAction () {
		return new SequentialScheduler();
	}
	
}
