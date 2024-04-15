package view;

import br.edu.fateczl.queue.Queue;
import controller.ParkController;
import model.Person;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Queue<Person> queue = new Queue<>();
		ParkController park = new ParkController();
		fillQueue(queue, 30);
		
		park.toy(queue);

	}
	
	public static void fillQueue(Queue<Person> queue, int amount) {
		int age;
		double height;
		for(int i = 0; i < amount; i++) {
			age = (int)((Math.random() * 31) + 10);
			height = (Math.random() * 0.65) + 1.35;
			queue.insert(new Person("Person" + (i+1), age, height));
		}
	}

}
