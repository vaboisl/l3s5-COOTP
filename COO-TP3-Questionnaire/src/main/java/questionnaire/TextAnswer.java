/**
 * 
 */
package questionnaire;

/**
 * @author vabois
 *
 */
public class TextAnswer extends Answer {
	
	TextAnswer (String answer) {
		super(answer);
	}
	
	public boolean accepts (String s) {
		return ! s.contains(" ");
	}
	
	public String instructions () {
		return "(symbolique) ";
	}
	
	@Override
	public String toString () {
		return (String) this.getValue();
	}
	
}
