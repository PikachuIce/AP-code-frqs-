import java.util.ArrayList;
import java.util.Arrays;

public class Digits {

	private ArrayList<Integer> digitList;

	public Digits(int num) {
		Integer num1 = num;
		String input = num1.toString();
		char[] temp = input.toCharArray();
		for (int i = 0; i < temp.length; i++) {
			digitList.add((int) temp[i]);
		}
	}

	public boolean isStrictlyIncreasing() {
		int[] sorted = new int[digitList.size()];
		for (int i = 0; i < sorted.length; i++) {
			sorted[i] = digitList.get(i);
		}
		int[] original = sorted;
		Arrays.sort(sorted);
		boolean same = false;
		for(int i = 0; i < sorted.length; i++) {
			if(sorted[i] == original[i]) {
				same = true;
			}
			if(same == false) {
				return same;
			}
		}
		return same;
	}
}