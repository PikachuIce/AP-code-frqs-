import java.util.Random;

public class RandomStringChooser {
	private String[] Words;
	private int WordsUsed = 0;
	public RandomStringChooser(String[] StringArr) {
		Words = StringArr;
	}

	public String getNext() {
		if (WordsUsed != Words.length) {
			Random numGen = new Random();
			int index = numGen.nextInt(Words.length);
			boolean taken = true;
			while (taken) {
				if (Words[index].equals("f01428")) {
					index = numGen.nextInt(Words.length);
					taken = true;
				} else {
					taken = false;
				}
			}
			String temp = Words[index];
			Words[index] = "f01428";
			WordsUsed++;
			return temp;
		}
		return "NONE";
	}
} 