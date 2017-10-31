/**
 * 
 */
package questionnaire;

/**
 * @author vabois
 *
 */
public class Question<T extends Answer> {
	protected String text;
	protected int nbPoints;
	protected Answer<T> rightAnswer;
	protected String userAnswer;
	
	public Answer<T> getRightAnswer () {
		
	}
	
	
	
}
