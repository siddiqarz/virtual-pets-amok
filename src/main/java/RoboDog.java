
public class RoboDog extends Dog implements RoboticInterface {

	private static final int DEFAULT_RUST_LEVEL = 4;
	private int rustLevel = DEFAULT_RUST_LEVEL;

	public RoboDog(String name, String description) {
		super(name, description);

	}

	@Override
	public int getRustLevel() {
		return rustLevel;
	}

	@Override
	public void oilPet() {
		rustLevel -= 1;
	}

	@Override
	public void tickRobotics() {
rustLevel ++;
happiness --;
	}

}
