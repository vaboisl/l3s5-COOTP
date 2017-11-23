/**
 * 
 */
package questionnaire;

/**
 * @author vabois
 *
 */
public class MockQuestion extends Question {
	int nbAskedQuestions = 7;
	
	
	protected MockQuestion (String text, Answer<?> answer, int nbPoints) {
		super(text,answer,nbPoints);
	}
	
}
