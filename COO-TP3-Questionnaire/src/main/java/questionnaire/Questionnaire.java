/**
 * 
 */
package questionnaire;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

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
			String uAnswer = sc.next();
			// saisit la réponse tant qu'elle est invalide 
			while (!q.getRightAnswer().accepts(uAnswer)) {
				System.out.print(q.getRightAnswer().instructions());
				uAnswer = sc.next();
			}
			q.setUserAnswer(uAnswer);
			if (q.isUserAnswerCorrect()) {
				System.out.println("correct (" + q.getNbPoints() + " point(s))");
				this.nb_points += q.getNbPoints();
			} else {
				System.out.println("incorrect, la bonne réponse est : " + q.getRightAnswer().toString());
			}
		}
		System.out.println("Vous avez " + this.nb_points + " points.");
		
	}
	
	public void addQuestion (Question q) {
		this.questions.add(q);
	}
	
	public static void main (String[] args) {
		try {
			Questionnaire quest = (new QuestionnaireFactory()).createQuestionnaire("/home/l3miage/vabois/Documents/COO/myGitProjects/l3s5-COOTP/COO-TP3-Questionnaire/src/main/java/questionnaire/Source.txt");
			quest.askAll();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
