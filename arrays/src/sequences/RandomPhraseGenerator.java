package sequences;

import java.util.Random;
import java.util.Random.*;

public class RandomPhraseGenerator {
	final static String[] PHRASES = { "��������� � �������.",
			"���� � ��������� �������.", "��������� ������� ���� �������.",
			"���� � ���-����������� ������� �� ���� ���������." };
	final static String[] EVENTS = { "���� �� �������� �����.",
			"����� �� �� �������.", "���� ������� ������� ����.",
			"�� ���� �� ��������, �� ���� �� �������� ���������.",
			"�������� � ���, �� ��� ����� �������" };
	final static String[] FIRST_NAME = { "�����", "����", "�����", "�����",
			"����" };
	final static String[] SECOND_NAME = { "�������", "������", "�������" };
	final static String[] CITIES = { "�����", "�������", "�����", "����",
			"������" };

	public static void printRandomPhrase() {
		Random rnd = new Random();
		System.out.println(PHRASES[rnd.nextInt(PHRASES.length)]
				+ EVENTS[rnd.nextInt(EVENTS.length)] + "--"
				+ FIRST_NAME[rnd.nextInt(FIRST_NAME.length)] + " "
				+ SECOND_NAME[rnd.nextInt(SECOND_NAME.length)] + ", "
				+ CITIES[rnd.nextInt(CITIES.length)]);
	}
}
