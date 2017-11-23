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
public class TextualTest extends QuestionnaireTest {
	
	@Test
	public void testBadImputNotAccepted () {
		assertFalse(q.getRightAnswer().accepts("Too Much  Blanks"));
	}
	
	@Test
	public void testCorrectImputAccepted () {
		assertTrue(q.getRightAnswer().accepts("Pippin"));
	}
	
	@Test
	public void testRightAnswerIsActuallyRecognized () {
		q.setUserAnswer("Tolkien");
		assertTrue(q.isUserAnswerCorrect());
	}
	
	@Test
	public void testWrongAnswerIsDismissed () {
		q.setUserAnswer("Frodo");
		assertFalse(q.isUserAnswerCorrect());
	}
	
	public Answer<String> createAnswer () {
		return new TextAnswer("Tolkien");
	}
	
}
