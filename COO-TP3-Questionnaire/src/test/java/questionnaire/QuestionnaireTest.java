/**
 * 
 */
package questionnaire;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author vabois
 *
 */
public class QuestionnaireTest {
	private MockQuestionnaireUI ui;
	private MockQuestion q;
	private Questionnaire qu;
	
	@Test
	public void testAnswerAsLongAsIsNotAcceptable () throws Exception {
		
	}
	
	private class MockQuestionnaireUI implements QuestionnaireUI {
		int nbRead = 0;
		
	}
	
	private class MockQuestion extends Question {
		int nbAskedQuestions = 3;
		int nbAcceptedQuestions = 0;
		
	}
	
}
