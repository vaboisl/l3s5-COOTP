/**
 * 
 */
package questionnaire;

import java.util.List;
import java.util.Iterator;

/**
 * @author vabois
 *
 */
public class ChoiceAnswer extends Answer {
	
	
	ChoiceAnswer (String s) {
		super(s);
		// ??
	}
	
	public boolean accepts (String s) {
		return true;
	}
	
	public String instructions () {
		String s = "(";
		Iterator<String> it = ((List<String>) this.value).iterator();
		while ( it.hasNext() ) {
			String elmt = it.next();
			s += elmt;
			if ( it.hasNext() ) {
				s += "   ";
			} else {
				s += ")";
			}
		}
		return s;
	}
	
}
