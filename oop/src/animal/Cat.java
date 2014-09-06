package animal;


public class Cat extends Animal {

	Cat() {
		super(0);
	}

	Cat(int age) {
		super(age, null);
	}

	Cat(int age, String name) {
		super(0, null, null);
	}

	Cat(int age, String name, String gender) {
		this.age = age;
		this.name = name;
		this.gender = gender;
	}

	@Override
	String produceNoise() {

		return "miau-miau";

	}

}
