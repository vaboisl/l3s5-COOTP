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
	
	public Question createQuestion (String text, String answer, String points, String className) throws Exception, IOException {
		try {
			int nbPoints = Integer.parseInt(points);
			return new Question(text, AnswerFactory.FACTORY.buildAnswer(className,answer), nbPoints);
		} catch (NumberFormatException e) {
			throw new IOException("bad format");
		}
	}
	
	public Questionnaire createQuestionnaire (String fileName) throws Exception, IOException {
		Questionnaire questionnaire = new Questionnaire();
		File source = new File(fileName);
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(source));
			String text;
			// read blocks of 4 lines : text, answer, number of points and name of answer class 
			while ((text = in.readLine()) != null) {
				String answer = in.readLine();
				String nbPoints = in.readLine();
				String className = in.readLine();
				if (answer == null || nbPoints == null || className == null) {
					throw new IOException("bad format");
				}
				questionnaire.addQuestion(this.createQuestion(text, answer, nbPoints, className));
			}
		} catch (FileNotFoundException e) {
			throw new IOException(e);
		} finally {
			in.close();
		}
		return questionnaire;
	}
	
}
