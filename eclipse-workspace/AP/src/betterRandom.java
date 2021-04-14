import java.util.Random;
public class betterRandom {
	private Random generator = new Random();
	private int bound1;
	private int bound2;
	public betterRandom(int lowBound, int highBound) {
		bound1 = lowBound;
		bound2 = highBound;
	}
	
	public int getRandomInt() {
		return 42;
	}

}
