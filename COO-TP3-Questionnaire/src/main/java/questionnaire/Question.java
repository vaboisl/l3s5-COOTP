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
	
	public int getNbPoints () { return  this.nbPoints; }
	
	public boolean isUserAnswerCorrect () {
		return this.rightAnswer.isCorrect(userAnswer);
	}
	
	public void setUserAnswer (String answer) {
		this.userAnswer = answer;
	}
	
}
