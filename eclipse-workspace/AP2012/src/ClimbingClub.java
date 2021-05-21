import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ClimbingClub {
	private List<ClimbInfo> climbList;
	ArrayList<String> sorter = new ArrayList<String>();
	public ClimbingClub() {
		climbList = new ArrayList<ClimbInfo>();
	}
	public void addClimb(String peakName, int climbTime) {
		climbList.add(new ClimbInfo(peakName, climbTime));
		sorter.add(peakName);
		//insert alphabetical sort algorithm here
	}
	public int distinctPeakNames() {
		HashSet<String> check = new HashSet<String>();
		for(int i = 0; i < sorter.size(); i++) {
			check.add(sorter.get(i));
		}
		return check.size();
		
	}
}
