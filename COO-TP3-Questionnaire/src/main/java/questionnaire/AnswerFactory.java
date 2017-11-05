/**
 * 
 */
package questionnaire;

import java.util.List;
import java.util.LinkedList;

/**
 * @author vabois
 *
 */
public class AnswerFactory {
	public static final AnswerFactory FACTORY = new AnswerFactory();
	
	public Answer<?> buildAnswer (String answer) {
		if (new NumericalAnswer(0).accepts(answer)) {
			return new NumericalAnswer(new Integer(answer));
		} else if (new YesNoAnswer(YesNo.oui).accepts(answer)) {
			return new YesNoAnswer(YesNo.valueOf(answer));
		} else if (new TextAnswer("").accepts(answer)) {
			return new TextAnswer(answer);
		} else {
			return null;
		}
	}
	
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
