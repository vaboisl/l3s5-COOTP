/**
 * 
 */
package action;

import static org.junit.Assert.*;
import org.junit.Before;


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
	
}
