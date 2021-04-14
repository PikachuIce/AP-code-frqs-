
public class Crossword {
	private Square[][] puzzle;
	public Crossword(boolean[][] blackSquares) {
		int labelIt = 1;
		 for(int i = 0; i < blackSquares.length; i++) {
			 for(int j = 0; j < blackSquares[i].length; j++) {
				 puzzle = new Square[blackSquares.length][blackSquares[i].length];
				 if(blackSquares[i][j]) {
					 puzzle[i][j] = new Square(true, 0);
				 }
				 if(toBeLabeled(i,j,blackSquares)) {
					 puzzle[i][j] = new Square(false, labelIt);
					 labelIt++;
				 }
			 }
		 }
	}
	private boolean toBeLabeled(int r, int c, boolean[][] blackSquares) {
		if(blackSquares[r][c]) {
			return false;
		}
		if(r == 0) {
			return true;
		}
		if(c == 0) {
			return true;
		}
		if(blackSquares[r - 1][c] || blackSquares[r][c-1]) {
			return true;
		}
		return false;
	}

}
