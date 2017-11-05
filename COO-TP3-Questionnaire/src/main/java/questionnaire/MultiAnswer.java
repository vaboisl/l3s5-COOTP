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
		return "(" + ((List<String>) this.value).size() + " réponses possibles) ";
	}
	
	@Override
	public String toString () {
		String s = "[";
		Iterator<String> it = ((List<String>) this.value).iterator();
		while ( it.hasNext() ) {
			String elmt = it.next();
			s += elmt;
			if ( it.hasNext() ) {
				s += " ; ";
			} else {
				s += "]";
			}
		}
		s += " : MultiAnswer";
		return s;
	}
	
}
