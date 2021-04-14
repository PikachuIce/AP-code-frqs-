import java.util.ArrayList;

public class WordPairList {

	private ArrayList<WordPair> allPairs;
	
	public WordPairList(String[] words) {
		for(int i = 0; i < words.length; i++) {
			String word1 = words[i];
			for(int j = i; j < words.length; j++) {
				allPairs.add(new WordPair(word1, words[j]));
			}
		}
	}
	
	public int numMatches() {
		int matches = 0;
		for(int i = 0; i < allPairs.size(); i++) {
			WordPair pair1 = allPairs.get(i);
			if(pair1.getFirst().equals(pair1.getSecond())) {
				matches++;
			}
		}
		return matches;
	}
	

}
