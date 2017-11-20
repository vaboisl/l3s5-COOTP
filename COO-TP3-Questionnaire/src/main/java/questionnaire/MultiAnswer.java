/**
 * 
 */
package questionnaire;

import java.util.List;

/**
 * @author vabois
 *
 */
public class MultiAnswer extends Answer {
	
	MultiAnswer (List<String> l) {
		super(l);
	}
	
	MultiAnswer (String s) {
		super(s);
	}
	
	public boolean accepts (String s) {
		return ! s.contains(" ");
	}
	
	public String instructions () {
		return "(" + ((String) this.value).split(" ; ").length + " réponses possibles) ";
	}
	
	@Override
	public boolean isCorrect (String s) {
		String[] correctValues = ((String) this.value).split(" ; ");
		for (String aCorrectValue : correctValues) {
			if (s.equals(aCorrectValue)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString () {
		String[] values = ((String) this.value).split(" ; ");
		String s = "[";
		for (int i = 0; i < values.length; i++) {
			s += values[i];
			if (i != values.length-1) {
				s += " ; ";
			} else {
				s += "]";
			}
		}
		s += " : MultiAnswer";
		return s;
	}
	
}
