package 间谍变声;

public class  Spy extends Person implements SpySkills,Driver,Teacher {

	public void teach() {
		System.out.println("Teaching Geography...");
	}
	public void driveCar() {
		System.out.println("Drivering for escape...");
	}
	public void stealInfo() {
		System.out.println("Stealing...");
	}
	@Override
	public void crackingPasswords() {
		System.out.println("Cracking...");
	}
	public void nserComputer() {
		System.out.println("Operating computer...");
	}
}

