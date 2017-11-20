/**
 * 
 */
package questionnaire;

/**
 * @author vabois
 *
 */
class MockQuestion extends Question {
	int nbAskedQuestions = 3;
	int nbAcceptedQuestions = 0;
	
	MockQuestion (String text, Answer<?> answer, int nbPoints) {
		super(text,answer,nbPoints);
	}
	
	
	
}
