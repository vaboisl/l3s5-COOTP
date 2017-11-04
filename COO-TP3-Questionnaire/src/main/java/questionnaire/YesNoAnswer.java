/**
 * 
 */
package questionnaire;

/**
 * @author vabois
 *
 */
public class YesNoAnswer extends Answer {
	
	YesNoAnswer (YesNo yesno) {
		super(yesno);
	}
	
	public boolean accepts (String s) {
		return s.equals("oui") ^ s.equals("non");
	}
	
	public String instructions () {
		return "(oui/non)";
	}
	
	@Override
	public String toString () {
		return this.value + " : YesNoAnswer";
	}
	
}
