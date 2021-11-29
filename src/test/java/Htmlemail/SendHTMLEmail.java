package Htmlemail;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendHTMLEmail {
   public static void main(String[] args) {
      // Recipient's email ID needs to be mentioned.
      String to = "sharma1998lavkush@gmail.com";

      // Sender's email ID needs to be mentioned
      String from = "rock01lav@gmail.com";
      final String username = "Lavkush Sharma";//change accordingly
      final String password = "Lavkush@1234";//change accordingly

      // Assuming you are sending email through relay.jangosmtp.net
      String host="smtp.gmail.com";
		
		//get the system prperties
		Properties properties=System.getProperties();
		System.out.println("PROPERTIES"+properties);
		
		//host set
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", "465");
		properties.put("mail.smtp.ssl.enable", "true");
		properties.put("mail.smtp.auth", "true");
		
		Session  session = Session.getInstance(properties, new Authenticator() {
	
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("rock01lav@gmail.com","Lavkush@1234");
			}
		});

      try {
            // Create a default MimeMessage object.
            Message message = new MimeMessage(session);

   	   // Set From: header field of the header.
	   message.setFrom(new InternetAddress(from));

	   // Set To: header field of the header.
	   message.setRecipients(Message.RecipientType.TO,
              InternetAddress.parse(to));

	   // Set Subject: header field
	   message.setSubject("Testing Subject");

	   // Send the actual HTML message, as big as you like
	   message.setContent(
              "<h1>This is actual message embedded in HTML tags</h1>",
             "text/html");

	   // Send message
	   Transport.send(message);

	   System.out.println("Sent message successfully....");

      } catch (MessagingException e) {
	   e.printStackTrace();
	   throw new RuntimeException(e);
      }
   }
}
