package sequences;

import java.util.Random;
import java.util.Random.*;

public class RandomPhraseGenerator {
	final static String[] PHRASES = { "Продуктът е отличен.",
			"Това е страхотен продукт.", "Постоянно ползвам този продукт.",
			"Това е най-страхотният продукт от тази категория." };
	final static String[] EVENTS = { "Вече се чувствам добре.",
			"Успях да се променя.", "Този продукт направи чудо.",
			"Не мога да повярвам, но вече се чувствам страхотно.",
			"Опитайте и Вие, аз съм много доволна" };
	final static String[] FIRST_NAME = { "Диана", "Петя", "Стела", "Елена",
			"Катя" };
	final static String[] SECOND_NAME = { "Иванова", "Кирова", "Петрова" };
	final static String[] CITIES = { "София", "Пловдив", "Варна", "Русе",
			"Бургас" };

	public static void printRandomPhrase() {
		Random rnd = new Random();
		System.out.println(PHRASES[rnd.nextInt(PHRASES.length)]
				+ EVENTS[rnd.nextInt(EVENTS.length)] + "--"
				+ FIRST_NAME[rnd.nextInt(FIRST_NAME.length)] + " "
				+ SECOND_NAME[rnd.nextInt(SECOND_NAME.length)] + ", "
				+ CITIES[rnd.nextInt(CITIES.length)]);
	}
}
