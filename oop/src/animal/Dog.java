package animal;


public class Dog extends Animal {

	Dog() {
		super(0);
	}

	Dog(int age) {
		super(age, null);
	}

	Dog(int age, String name) {
		super(0, null, null);
	}

	Dog(int age, String name, String gender) {
		this.age = age;
		this.name = name;
		this.gender = gender;
	}

	@Override
	String produceNoise() {

		return "bau-bau";
	}

}
