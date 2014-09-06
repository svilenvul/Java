package animal;

public class AnimalTest {

	public static void main(String[] args) {
		Animal[] animals = new Animal[3];
		animals[0] = new Cat(4, "Macka", "female");
		animals[1] = new Dog(5, "Rex", "male");
		animals[2] = new Frog(5, "Jhabrana");

		for (Animal animal : animals) {
			System.out.println(animal);
		}

	}

}
