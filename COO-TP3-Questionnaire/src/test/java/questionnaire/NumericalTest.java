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
public class NumericalTest extends QuestionnaireTest {
	
	@Test
	public void testBadImputNotAccepted () {
		assertFalse(q.getRightAnswer().accepts("Some_Symbolic_Answer"));
		assertFalse(q.getRightAnswer().accepts("oui"));
	}
	
	@Test
	public void testCorrectImputAccepted () {
		assertTrue(q.getRightAnswer().accepts("15"));
	}
	
	@Test
	public void testRightAnswerIsActuallyRecognized () {
		q.setUserAnswer("54");
		assertTrue(q.isUserAnswerCorrect());
	}
	
	@Test
	public void testWrongAnswerIsDismissed () {
		q.setUserAnswer("30");
		assertFalse(q.isUserAnswerCorrect());
	}
	
	public Answer<Integer> createAnswer () {
		return new NumericalAnswer(54);
	}
	
}
