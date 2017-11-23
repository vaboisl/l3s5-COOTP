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
	
	public YesNoAnswer (String s) {
		super(YesNo.valueOf(s));
	}
	
	public boolean accepts (String s) {
		return s.equals("oui") ^ s.equals("non");
	}
	
	public String instructions () {
		return "(oui/non) ";
	}
	
	@Override
	public String toString () {
		if (this.getValue() == YesNo.oui) {
			return "oui";
		} else {
			return "non";
		}
	}
	
}
