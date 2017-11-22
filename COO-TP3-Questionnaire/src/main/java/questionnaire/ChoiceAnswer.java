/**
 * 
 */
package questionnaire;

import java.util.List;
import java.util.Random;

/**
 * @author vabois
 *
 */
public class ChoiceAnswer extends Answer {
	
	ChoiceAnswer (List<String> l) {
		super(l);
	}
	
	public ChoiceAnswer (String s) {
		super(s);
	}
	
	public boolean accepts (String s) {
		if (s.contains("  ")) {
			return false;
		} else {
			String[] acceptableValues = ((String) this.value).split(" | ");
			for (String anAcceptableValue : acceptableValues) {
				if (s.equals(anAcceptableValue)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public String instructions () {
		String[] suggested = ((String) this.value).split(" | ");
		String[] order = new String[suggested.length];
		int cpt = 0; int randomized = 0;
		Random r = new Random();
		while (cpt != order.length) {
			randomized = r.nextInt(suggested.length);
			if (! suggested[randomized].equals("")) {
				order[cpt] = suggested[randomized];
				suggested[randomized] = "";
				cpt++;
			}
		}
		String instructions = "(";
		for (int i = 0; i < order.length; i++) {
			instructions += order[i];
			if (i != order.length-1) {
				instructions += "   ";
			} else {
				instructions += ") ";
			}
		}
		return instructions;
	}
	
	@Override
	public boolean isCorrect (String s) {
		String theCorrectValue = ((String) this.value).split(" | ")[0];
		return s.equals(theCorrectValue);
	}
	
	@Override
	public String toString () {
		return ((String) this.value).split(" | ")[0];
	}
	
}
