package controller;

import br.edu.fateczl.queue.Queue;
import model.Person;

public class ParkController {

	public ParkController() {
		super();
	}

	public void toy(Queue<Person> queue) throws Exception {
		while (!queue.isEmpty()) {
			Person person = queue.remove();
			boolean validHeight = person.getHeight() > 1.60;
			boolean validAge = person.getAge() > 16;
			String output;
			if (validHeight && validAge)
				output = "Released";
			else
				output = String.format("Blocked: %s, %s",
						(!validHeight ? "insufficient height (" + String.format("%.2f", person.getHeight()) + "m)" : " "),
						(!validAge ? "insufficient age (" + person.getAge() + "yo)" : " "))
						.replaceAll("(\\s,\\s)|(,\\s{2})", "");

			System.out.println(person.getName() + ": " + output);
		}
	}
}
