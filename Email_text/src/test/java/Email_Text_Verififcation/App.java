package Email_Text_Verififcation;

import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class App
{
	
		public static void main(String[] args) {

			String host = "pop.gmail.com";// change accordingly
			String mailStoreType = "pop3";
			String username = "sharmalavkush404@gmail.com";// change accordingly
			String password = "Lavkush@1234";// change accordingly

			check(host, mailStoreType, username, password);

		}


		public static void check(String host, String storeType, String user,
				String password) 
		{
			try {

			      //create properties field
			      Properties properties = new Properties();

			      properties.put("mail.pop3.host", host);
			      properties.put("mail.pop3.port", "465");
			      properties.put("mail.pop3.starttls.enable", "true");
			      
			      Session emailSession = Session.getDefaultInstance(properties);
			  
			      //create the POP3 store object and connect with the pop server
			      Store store = emailSession.getStore("pop3s");                      //store is an abstract class of service//

			      store.connect(host, user, password);                                //connect is a method of service

			      //create the folder object and open it
			      Folder emailFolder = store.getFolder("INBOX");
			      emailFolder.open(Folder.READ_ONLY);

			      // retrieve the messages from the folder in an array and print it
			      Message[] messages = emailFolder.getMessages();
			      System.out.println("messages.length---" + messages.length);

			      int n = messages.length;
			      
			      for (int i = 0; i < n; i++) {
			    	  
			         Message message = messages[i];
			         System.out.println("---------------------------------");
			         System.out.println("Email Number " + (i + 1));
			         System.out.println("Subject: " + message.getSubject());
			         System.out.println("From: " + message.getFrom()[0]);
			        
			      }

			      //close the store and folder objects
			      emailFolder.close(true);
			      store.close();

			      } catch (NoSuchProviderException e) {
			         e.printStackTrace();
			      } catch (MessagingException e) {
			         e.printStackTrace();
			      } catch (Exception e) {
			         e.printStackTrace();
			      }
		}

}
