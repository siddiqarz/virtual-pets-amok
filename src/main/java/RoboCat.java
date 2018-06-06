
public class RoboCat extends VirtualPet implements RoboticInterface {

	private static final int DEFAULT_RUST_LEVEL = 2;
	private int rustLevel = DEFAULT_RUST_LEVEL;

	public RoboCat(String name) {
		super(name);
	}

	public int getRustLevel() {
		return rustLevel;
	}

	@Override
	public void oilPet() {
		rustLevel -= 2;
	}

}
