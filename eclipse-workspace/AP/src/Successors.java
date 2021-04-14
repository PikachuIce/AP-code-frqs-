
public class Successors {
	public static Position findPosition(int num, int[][] intArr) {
		for (int i = 0; i < intArr.length; i++) {
			for (int j = 0; j < intArr[i].length; j++) {
				int temp = intArr[i][j];
				if (temp == num) {
					return new Position(i, j);
				}
			}
		}
		return null;
	}

	public static Position[][] getSuccessorArray(int[][] intArr) {
		int smallestInt = Integer.MAX_VALUE;
		int largestInt = Integer.MIN_VALUE;
		int successor;
		Position[][] cords = new Position[intArr.length][intArr[0].length];
		for (int i = 0; i < intArr.length; i++) {
			for (int j = 0; j < intArr[i].length; j++) {
				int temp = intArr[i][j];
				smallestInt = Math.min(smallestInt, temp);
				largestInt = Math.max(largestInt, temp);
			}
		}
		int curRow = findPosition(smallestInt, intArr).returnR();
		int curCol = findPosition(smallestInt, intArr).returnC();
		successor = smallestInt;
		for (int i = 0; i < largestInt - smallestInt; i++) {
			Position pos1 = findPosition(successor + 1, intArr);
			cords[curRow][curCol] = pos1;
			successor++;
			curRow = findPosition(successor, intArr).returnR();
			curCol = findPosition(successor, intArr).returnC();

		}
		return cords;
	}
}
