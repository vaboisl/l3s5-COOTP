/**
 * 
 */
package questionnaire;

import java.util.List;
import java.util.LinkedList;
import java.lang.reflect.Constructor;

/**
 * @author vabois
 *
 */
public class AnswerFactory {
	public static final AnswerFactory FACTORY = new AnswerFactory();
	
	public Answer<?> buildAnswer (String answerClassName, String answerText) throws Exception {
		Class<?> c = Class.forName(answerClassName);
		Constructor<?> ctr = c.getConstructor(String.class);
		Answer<?> a = (Answer<?>) ctr.newInstance(answerText);
		return a;
	}
	
	/* Theorically not anymore needed */
	public MultiAnswer buildMultiAnswer (String answer) {
		List<String> rep = new LinkedList<String>();
		// parse la chaîne de texte 
		String[] tokens = answer.split(" ; ");
		for (int i = 0; i < tokens.length; i++) {
			rep.add(tokens[i]);
		}
		return new MultiAnswer(rep);
	}
	
}
