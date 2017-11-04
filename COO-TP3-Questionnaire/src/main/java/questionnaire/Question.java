/**
 * 
 */
package questionnaire;

/**
 * @author vabois
 *
 */
public class Question<T> {
	protected String text;
	protected int nbPoints;
	protected Answer<T> rightAnswer;
	protected String userAnswer;
	
	protected Question (String text, Answer<?> answer, int nbPoints) {
		this.text = text;
		this.rightAnswer = (Answer<T>)answer;
		this.nbPoints = nbPoints;
	}
	
	public Answer<T> getRightAnswer () {
		return this.rightAnswer;
	}
	
	public String getText () {
		return this.text;
	}
	
	
	
	public boolean isUserAnswerCorrect () {
		return this.userAnswer.equals(this.rightAnswer);
	}
	
	public void setUserAnswer (String answer) {
		this.userAnswer = answer;
	}
	
}
