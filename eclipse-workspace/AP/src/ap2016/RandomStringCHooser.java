package ap2016;

import java.util.Random;

public class RandomStringCHooser {
	private String[] Words;
	private int WordsUsed = 0;
	public RandomStringCHooser(String[] StringArr) {
		Words = StringArr;
	}

	public String getNext() {
		if (WordsUsed != Words.length) {
			Random numGen = new Random();
			int index = numGen.nextInt(Words.length);
			boolean taken = true;
			while (taken) {
				if (Words[index].equals("                                      ")) {
					index = numGen.nextInt(Words.length);
					taken = true;
				} else {
					taken = false;
				}
			}
			String temp = Words[index];
			Words[index] = "                                      ";
			WordsUsed++;
			return temp;
		}
		return "NONE";
	}
} 