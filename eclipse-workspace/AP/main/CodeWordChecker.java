
public class CodeWordChecker implements StringChecker {
	private int lowerCharBound;
	private int upperCharBound;
	private String input;
	public CodeWordChecker(int lcb, int ucb, String initialInput) {
		lowerCharBound = lcb;
		upperCharBound = ucb;
		input = initialInput;
	}
	public CodeWordChecker(String initialInput) {
		lowerCharBound = 6;
		upperCharBound = 24;
		input = initialInput;
	}
	
	
	
	public boolean isValid(String str) {
		if(str.length() > upperCharBound  || str.length() < lowerCharBound) {
			return false;
		}
		if(str.contains(input)) {
			return false;
		}
		return true;
	}

}
