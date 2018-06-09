
public class RoboCat extends VirtualPet implements RoboticInterface {

	private static final int DEFAULT_RUST_LEVEL = 2;
	private int rustLevel = DEFAULT_RUST_LEVEL;

	public RoboCat(String name, String description) {
		super(name, description);
	}

	public int getRustLevel() {
		return rustLevel;
	}

	@Override
	public void oilPet() {
		rustLevel -= 5;
		happiness +=2;
	}

	@Override
	public void tickRobotics() {
		rustLevel++;
		happiness--;
		health--;
	}

}
