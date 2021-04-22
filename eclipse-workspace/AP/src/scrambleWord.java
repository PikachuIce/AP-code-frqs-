import java.util.List;

public class scrambleWord {
	public static String scrambleWord(String word) {
		char[] array = word.toCharArray();
		boolean[] switchable = new boolean[word.length()];
		for (int i = 0; i < array.length - 1; i++) {
			char comp1 = array[i];
			char comp2 = array[i + 1];
			if (switchable[i] && switchable[i + 1]) {
				if (comp1 == 'A') {
					if (comp2 != 'A') {
						array[i] = comp2;
						array[i + 1] = comp1;
					}
				}
			}
		}
		String result = "";
		for(int i = 0; i < array.length; i++) {
			result += array[i];
		}
		return result;

	}
	public static void scrambleOrRemove(List<String> wordList) {
		 for(int i = 0; i < wordList.size(); i++) {
			 String temp = wordList.get(i);
			 String scrambled = scrambleWord(temp);
			 if(temp.compareTo(scrambled) == 0) {
				 wordList.remove(i);
				 i--;
			 }
		 }
	}
	
}
