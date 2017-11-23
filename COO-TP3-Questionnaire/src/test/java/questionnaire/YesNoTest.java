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
public class YesNoTest extends QuestionnaireTest {
	
	@Test
	public void testBadImputNotAccepted () {
		assertFalse(q.getRightAnswer().accepts("Standard_Text_Answer"));
		assertFalse(q.getRightAnswer().accepts("42"));
		assertFalse(q.getRightAnswer().accepts("Too  Much   Blanks    2"));
	}
	
	@Test
	public void testCorrectImputAccepted () {
		assertTrue(q.getRightAnswer().accepts("non"));
	}
	
	@Test
	public void testRightAnswerIsActuallyRecognized () {
		q.setUserAnswer("oui");
		assertTrue(q.isUserAnswerCorrect());
	}
	
	@Test
	public void testWrongAnswerIsDismissed () {
		q.setUserAnswer("non");
		assertFalse(q.isUserAnswerCorrect());
	}
	
	public Answer<YesNo> createAnswer () {
		return new YesNoAnswer("oui");
	}
	
}
