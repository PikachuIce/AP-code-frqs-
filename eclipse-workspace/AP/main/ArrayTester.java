import java.util.Arrays;
import java.util.HashSet;

public class ArrayTester {

	public static int[] getColumn(int[][] arr2D, int c) {
		int[] array = new int[arr2D.length];
		for (int i = 0; i < arr2D.length; i++) {
			array[i] = arr2D[i][c];
		}
		return array;
	}

	public static boolean containsDuplicates(int[] arr) {
		HashSet<Integer> temp = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			temp.add(arr[i]);
		}
		if (temp.size() == arr.length) {
			return false;
		}
		return true;
	}

	public static boolean isLatin(int[][] square) {
		if (containsDuplicates(square[0])) {
			return false;
		}
		int[] masterArr = square[0];
		Arrays.sort(masterArr);
		boolean isLatinBol = true;
		for (int i = 0; i < square.length; i++) {
			int[] temp1 = square[i];
			Arrays.sort(temp1);

			for (int j = 0; j < square.length; j++) {
				if (masterArr[i] != temp1[i]) {
					isLatinBol = false;
					break;
				}
			}
		}
		for (int i = 0; i < square.length; i++) {
			int[] temp1 = getColumn(square, i);
			Arrays.sort(temp1);
			for (int j = 0; j < square.length; j++) {
				if (masterArr[i] != temp1[i]) {
					isLatinBol = false;
					break;
				}
			}
		}
		return isLatinBol;
	}

}
