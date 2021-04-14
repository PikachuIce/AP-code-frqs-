
public class Phrase {

	private String currentPhase;

	public Phrase(String p) {
		currentPhase = p;
	}

	public int findNthOccurrence(String str, int n) {
		int occurrenceCount = 0;
		for(int i = 0; i < currentPhase.length()-str.length(); i++) {
			String sub = currentPhase.substring(i, i+str.length());
			if(sub.equals(str)) {
				occurrenceCount++;
				if(occurrenceCount == n) {
					return i;
				}
			}
		}
		return -1;
	}

	public void replaceNthOccurence(String str, int n, String repl) {
		int occurrenceCount = 0;
		for(int i = 0; i < currentPhase.length()-str.length(); i++) {
			String sub = currentPhase.substring(i, i+str.length());
			if(sub.equals(str)) {
				occurrenceCount++;
				if(occurrenceCount == n) {
					String p1 = currentPhase.substring(0, i);
					String p2 = currentPhase.substring(i+str.length());	
					currentPhase = p1 + repl + p2;
				}
			}
		}
	}

	public int findLastOccurrence(String str) {
		int occurrenceCounter = 0;
		for(int i = 0; i < currentPhase.length()-str.length(); i++) {
			String sub = currentPhase.substring(i, i+str.length());
			if(sub.equals(str)) {
				occurrenceCounter++;
				
			}
		}
		return findNthOccurrence(str, occurrenceCounter);
		
	}
	
	public String toString() {
		return currentPhase;
	}
}
