/**
 * 
 */
package questionnaire;

/**
 * @author vabois
 *
 */
public abstract class Answer<T> {
	protected T value;
	
	Answer (T theRightValue) {
		this.value = theRightValue;
	}
	
	public abstract boolean accepts (String s) ;
	
	public abstract String instructions () ;
	
	public T getValue () {
		return this.value;
	}
	
	public boolean isCorrect (String s) {
		return s.equals((String)this.value);
	}
	
	@Override
	public String toString () {
		return this.value + " : Answer";
	}
	
}
