package animal;

public abstract class Animal {

	protected int age = 0;
	protected String name = null;
	protected String gender = null;

	Animal() {
		this(0);
	}

	Animal(int age) {
		this(age, null);
	}

	Animal(int age, String name) {
		this(0, null, null);
	}

	Animal(int age, String name, String gender) {
		this.age = age;
		this.name = name;
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	abstract String produceNoise();

	@Override
	public String toString() {
		String formatted = this.getClass().getSimpleName() + ", age:"
				+ this.age + ", " + this.produceNoise();
		return formatted;
	}
}
