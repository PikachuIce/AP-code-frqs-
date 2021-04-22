import java.util.List;

public class SeatingChart {
	private Student[][] seats;

	public SeatingChart(List<Student> studentList, int rows, int cols) {
		seats = new Student[rows][cols];
		int iterate = 0;
		for (int i = 0; i < cols; i++) {
			for (int j = 0; j < rows; j++) {
				if (iterate < studentList.size()) {
					seats[i][j] = studentList.get(iterate);
					iterate++;
				}else {
					seats[i][j] = null;
				}
			}
		}
	}

	public int removeAbsentStudents(int allowedAbsences) {
		int removed = 0;
		for(int i = 0; i < seats.length; i++) {
			for(int j = 0; j < seats[i].length; j++) {
				Student temp = seats[i][j];
				int abCount = temp.getAbsenceCount();
				if(abCount > allowedAbsences) {
					seats[i][j] = null;
					removed++;
				}
			}
		}
		return removed;
	}
}
