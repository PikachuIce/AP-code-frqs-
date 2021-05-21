
public class HorseBarn {
	private Horse[] spaces;
	public int findHorseSpace(String name) {
		for(int i = 0; i < spaces.length; i++) {
			String temp = spaces[i].getName();
			if(temp.equals(name)) {
				return i;
			}
		}
		return -1;
	}
	public void consolidate() {
		for(int i = 0; i < spaces.length; i++) {
			if(spaces[i] == null) {
				for(int j = i; j < spaces.length; j++) {
					if(spaces != null) {
						spaces[i] = spaces[j];
						spaces[j] = null;
					}
				}
			}
		}
	}

}
