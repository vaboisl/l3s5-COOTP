/**
 * 
 */
package questionnaire;

import java.io.IOException;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author vabois
 *
 */
public abstract class QuestionnaireTest {
	protected MockQuestion q;
	protected Questionnaire qu;
	
	
	@Before
	public void initBefore () throws Exception {
		try {
			qu = (new QuestionnaireFactory()).createQuestionnaire("question_tolkien.txt");
		} catch (IOException e) {
			throw new IOException(e);
		}
		q = new MockQuestion("Mock", this.createAnswer(), 15);
	}
	
	
	@Test
	public void testCorrectNumberOfQuestionsToBeAsked () {
		assertSame(q.nbAskedQuestions, qu.questions.size());
	}
	
	public abstract Answer createAnswer () ;
	
}
