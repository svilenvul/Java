package animal;


public class Frog extends Animal {

	Frog() {
		super(0);
	}

	Frog(int age) {
		super(age, null);
	}

	Frog(int age, String name) {
		super(0, null, null);
	}

	Frog(int age, String name, String gender) {
		this.age = age;
		this.name = name;
		this.gender = gender;
	}

	@Override
	String produceNoise() {

		return "quak-quak";

	}
}
