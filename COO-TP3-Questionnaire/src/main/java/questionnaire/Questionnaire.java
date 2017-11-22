/**
 * 
 */
package questionnaire;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

/**
 * @author vabois
 *
 */
public class Questionnaire {
	protected List<Question> questions;
	protected int nb_points;
	
	public Questionnaire () {
		this.questions = new ArrayList<Question>();
		this.nb_points = 0;
	}
	
	public void askAll () {
		Scanner sc = new Scanner(System.in);
		for (Question q : this.questions) {
			System.out.println(q.getText());
			System.out.print(q.getRightAnswer().instructions());
			// saisit la réponse tant qu'elle est invalide 
			String userAnswer = sc.next();
			while (! q.getRightAnswer().accepts(userAnswer)) {
				System.out.print(q.getRightAnswer().instructions());
				userAnswer = sc.next();
			}
			q.setUserAnswer(userAnswer);
			if (q.isUserAnswerCorrect()) {
				System.out.println("correct (" + q.getNbPoints() + " point(s))");
				this.nb_points += q.getNbPoints();
			} else {
				System.out.println("incorrect, la bonne réponse est : " + q.getRightAnswer().toString());
			}
		}
		sc.close();
		System.out.println("\nVous avez " + this.nb_points + " points.");
	}
	
	public void addQuestion (Question q) {
		this.questions.add(q);
	}
	
	public static void main (String[] args) throws Exception {
		QuestionnaireFactory qf = new QuestionnaireFactory();
		try {
			Questionnaire q = qf.createQuestionnaire("question_tolkien.txt");
			q.askAll();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
