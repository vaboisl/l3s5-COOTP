/**
 * 
 */
package questionnaire;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author vabois
 *
 */
public class QuestionnaireFactory {
	
	public Question createQuestion (String text, String answer, String points) throws IOException {
		try {
			int nbPoints = Integer.parseInt(points);
			return new Question(text, AnswerFactory.FACTORY.buildAnswer(answer), nbPoints);
		} catch (NumberFormatException e) {
			throw new IOException("bad format");
		}
	}
	
	public Questionnaire createQuestionnaire (String fileName) throws IOException {
		Questionnaire questionnaire = new Questionnaire();
		File source = new File(fileName);
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(source));
			String text;
			// read blocks of 3 lines : text, answer and number of points 
			while ((text = in.readLine()) != null) {
				String answer = in.readLine();
				String nbPoints = in.readLine();
				if (answer == null || nbPoints == null) {
					throw new IOException("bad format");
				}
				questionnaire.addQuestion(this.createQuestion(text, answer, nbPoints));
			}
		} catch (FileNotFoundException e) {
			throw new IOException(e);
		} finally {
			in.close();
		}
		return questionnaire;
	}
	
}
