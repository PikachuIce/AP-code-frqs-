import java.util.List;

public class StringFormatter {

	public static int totalLetters(List<String> wordList) {
		int result = 0;
		for (int i = 0; i < wordList.size(); i++) {
			String temp = wordList.get(i);
			result += temp.length();
		}
		return result;
	}

	public static int basicGapWidth(List<String> wordList, int formattedLen) {
		int wordCount = wordList.size();
		int exSpace = formattedLen - totalLetters(wordList);
		int base = exSpace / (wordCount - 1);
		return base;
	}

	public static int leftoverSpaces(List<String> wordList, int formattedLen) {
		int wordCount = wordList.size();
		int exSpace = formattedLen - totalLetters(wordList);
		int result = exSpace % (wordCount - 1);
		return result;
	}

	public static String format(List<String> wordList, int formattedLen) {
		int basic = basicGapWidth(wordList, formattedLen);
		int leftovers = leftoverSpaces(wordList, formattedLen);
		int spaceCount = wordList.size() - 1;
		String result = "";
		String[] spaceAllocator = new String[wordList.size() - 1];
		for (int i = 0; i < wordList.size(); i++) {
			for (int j = 0; j < basic; j++) {
				spaceAllocator[i] += " ";
			}
		}

		while (leftovers > 0) {
			for (int i = 0; i < wordList.size(); i++) {
				spaceAllocator[i] += " ";
				leftovers--;
				if (leftovers == 0) {
					break;
				}
			}
		}

		boolean wordOrSpace = true;
		int wordIt = 0;
		int spaceIt = 0;
		for (int i = 0; i < (wordList.size() + spaceCount); i++) {
			if (wordOrSpace) {
				result += wordList.get(wordIt);
				wordIt++;
			} else {
				result += spaceAllocator[spaceIt];
				spaceIt++;
			}

		}
		return result;
	}
}
