
public class MultPractice implements StudyPractice{
	private int i1;
	private int i2;
	public MultPractice(int integer1, int integer2) {
		i1 = integer1;
		i2 = integer2;
	}
	
	public String getProblem() {
		return i1 + " TIMES " + i2;
	}
	
	public void nextProblem() {
		i2++;
	}

}
