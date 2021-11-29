package Demo1;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendEmail {


	static void sendemail() throws EmailException {
		Email email = new SimpleEmail();
		email.setHostName("smtp.googlemail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("rock01lav@gmail.com", "Lavkush@1234"));
		email.setSSLOnConnect(true);
		email.setFrom("Lavkush@gmail.com");
		email.setSubject("Selenium Test Report");
		email.setMsg("This is a test mail from selenium)");
		email.addTo("palvimonga884@gmail.com");
		email.send();
	}

}
