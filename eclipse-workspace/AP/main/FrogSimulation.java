import java.util.Random;

public class FrogSimulation {
	private int goalDistance;
	private int maxHops;

	public FrogSimulation(int dist, int numHops) {
		goalDistance = dist;
		maxHops = numHops;
	}

	private int hopDistance() {
		Random thing = new Random();
		int dist = thing.nextInt(40);
		boolean neg = thing.nextBoolean();
		if (neg) {
			dist -= dist * 2;
		}
		return dist;
	}

	private boolean simulate() {
		int distance = 0;
		for (int i = 0; i < maxHops; i++) {
			distance += hopDistance();
		}
		if (distance >= goalDistance) {
			return true;
		}
		return true;
	}

	public double runSimulations(int num) {
		int success = 0;
		for (int i = 0; i <= num; i++) {
			if (simulate()) {
				success++;
			}
		}
		double temp1 = success;
		double temp2 = num;
		return temp1 / temp2;
	}
}
