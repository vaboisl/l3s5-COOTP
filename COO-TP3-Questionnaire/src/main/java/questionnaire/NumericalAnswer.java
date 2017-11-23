/**
 * 
 */
package questionnaire;

/**
 * @author vabois
 *
 */
public class NumericalAnswer extends Answer {
	
	NumericalAnswer (Integer i) {
		super(i);
	}
	
	public NumericalAnswer (String s) {
		super(new Integer(s));
	}
	
	public boolean accepts (String s) {
		try {
			Integer.parseInt(s);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
	
	public String instructions () {
		return "(numerique) ";
	}
	
	@Override
	public String toString () {
		return this.getValue().toString();
	}
	
}
