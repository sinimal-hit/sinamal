package 间谍变声;

public class SpyDemo {

	public static void main(String[] args) {
		Person person=new Spy();
		person.setAge(30);
		person.setGender("M");
		person.setName("Tom");
		person.learn();
		if(person instanceof SpySkills) {
			SpySkills spyer=(SpySkills)person;
			spyer.stealInfo();
			spyer.crackingPasswords();
		}
		if(person instanceof Driver) {
			Driver driver=(Driver)person;
			driver.driveCar();
		}
		if(person instanceof Teacher) {
			Teacher teacher=(Teacher)person;
		}

	}

}
