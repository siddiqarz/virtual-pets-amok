
public class RoboDog extends Dog implements RoboticInterface {

	private static final int DEFAULT_RUST_LEVEL = 4;
	private int rustLevel = DEFAULT_RUST_LEVEL;

	public RoboDog(String name) {
		super(name);
		
	}
	public int getRustLevel() {
		return rustLevel;
	}
@Override
public void oilAllPets() {
	rustLevel-=1;
}


}
