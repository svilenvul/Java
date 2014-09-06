package human.test;

import human.Worker;

import java.util.Arrays;

public class SortWorkersBySalaryTest {

	public static void main(String[] args) {
		Worker[] workers = new Worker[10];
		workers[0] = new Worker("Peter", "Petkov", 400, 100);
		workers[1] = new Worker("Maria", "Getova", 600, 125);
		workers[2] = new Worker("Ivailo", "Petrov", 550, 80);
		workers[3] = new Worker("Ivailo", "Nedelchev", 700, 100);
		workers[4] = new Worker("Svilen", "Valkanov", 800, 130);
		workers[5] = new Worker("Kostadin", "Milev", 870, 170);
		workers[6] = new Worker("Ivo", "Idakiev", 800, 100);
		workers[7] = new Worker("Dragomir", "Rusev", 600, 120);
		workers[8] = new Worker("Kostadin", "Dimitrov", 800, 100);
		workers[9] = new Worker("Dobrqna", "Koleva", 400, 70);

		Arrays.sort(workers);

		for (Worker worker : workers) {
			System.out.println(worker);
		}
	}

}
