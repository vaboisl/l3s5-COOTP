/**
 * 
 */
package questionnaire;

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
	
}
