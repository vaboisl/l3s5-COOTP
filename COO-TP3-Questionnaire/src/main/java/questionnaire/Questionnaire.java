/**
 * 
 */
package questionnaire;

import java.util.List;
import java.util.ArrayList;

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
		
	}
	
	public void addQuestion (Question q) {
		
	}
	
}
