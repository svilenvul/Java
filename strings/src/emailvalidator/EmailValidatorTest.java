package emailvalidator;

import java.net.URISyntaxException;
import java.net.URL;

public class EmailValidatorTest {
	public static void main (String[] args) throws URISyntaxException {
		URL inputFile = EmailValidator.class.getResource("data/mails.txt");
		URL outputFile = EmailValidator.class.getResource("data/validMails.txt");
			
		EmailValidator.validateEmails (inputFile.getPath(), outputFile.getPath());
	}
}
