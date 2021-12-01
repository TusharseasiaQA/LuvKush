package Email_Text_Verififcation;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMultipart;
import javax.mail.search.FromTerm;




public class Email_verify {
	public static Message[] readEmail() {
	     System.out.println("---------------Read Mail Service Started---------------");
	     Message[] messages = null;
	     Properties properties = new Properties();
	     properties.put("mail.imaps.host","imap.gmail.com");
	     properties.put("mail.imaps.port","993");
	     properties.put("mail.imaps.starttls.enable", true);
	     Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
	         protected PasswordAuthentication getPasswordAuthentication() {
	             return new PasswordAuthentication("sharmalavkush404@gmail.com","Lavkush@1234");
	         }
	     });
	 
	     try {
	         Store store = session.getStore("imaps");  //i maps is used to get mail
	         store.connect("sharmalavkush404@gmail.com","Lavkush@1234");
	         System.out.println(session.getStore("imaps")); //to get the link of server
	         Folder emails = store.getFolder("Inbox");
	         emails.open(Folder.READ_WRITE);
	         messages = emails.search(new FromTerm(new InternetAddress("nqt@mail.digialm.com")));
	         for (Message message : messages) {
	             System.out.println(" Subject "+message.getSubject());
	             MimeMultipart result = (MimeMultipart) message.getContent();
	             for ( int i =0; i < result.getCount() ; i++ ){
	                 if (result.getBodyPart(i).getContentType().contains("TEXT/PLAIN")) {
	                     String mail = result.getBodyPart(i).getContent().toString();
	                     System.out.println(mail);
	                 }
	             }
	         }
	         emails.close(false);
	         store.close();
	         System.out.println("---------------Mail Service Stopped---------------");
	         } catch (IOException | MessagingException ex) {
	             ex.printStackTrace();
	         }
	     return messages;
	 }
	public static void main(String[] args) {
		readEmail();
	}
}
