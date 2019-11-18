//package practise;
//
//import java.net.Authenticator;
//import java.net.PasswordAuthentication;
//import java.util.Properties;
//
//import com.sun.jdi.connect.Transport;
//
//public class SendEmail {
//	
//	public void getEmail(String to,String from, String userName,String password,Properties props,String subject,String messageBody)
//	  {
//	      MimeBodyPart mimeBodyPart=new MimeBodyPart();
//	      mimeBodyPart.setContent(messageBody,"text/html");
//	      MimeMultipart multipart=new MimeMultipart();
//	      multipart.addBodyPart(mimeBodyPart);
//	      Session session=Session.getInstance(props,new Authenticator()
//	        {
//	          protected PasswordAuthentication getPasswordAuthentication()
//	           {
//	              return new PasswordAuthentication(userName,password);
//	           }
//	       });
//	         try{
//	              MimeMessage message=new MimeMessage(session);
//	              message.setFrom(new InternetAddress(from));
//	              message.setContent(multipart);
//	              message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(to));
//	             message.setSubject("Have You got Mail!");
//	             message.setText(messageBody,"UTF-8","html");
//	             Transport.send(message);
//	           }
//	           catch(MessagingException ex){System.out.println(ex)}
//	      public static void main(String arg[]){
//	         SendEmail sendEmail=new SendEmail();
//	           String to = "XXXXXXX@gmail.com";      
//	           String from = "XXXXXXXX@gmail.com";
//	           final String username = "XXXXX@gmail.com";
//	           final String password = "XXXX";
//	            String subject="Html Template";
//
//	          String body = "<i> Congratulations!</i><br>";
//	          body += "<b>Your Email is working!</b><br>";
//	          body += "<font color=red>Thank </font>";
//	          String host = "smtp.gmail.com";
//	          Properties props = new Properties();
//	          props.put("mail.smtp.auth", "true");
//	          props.put("mail.smtp.starttls.enable", "true");
//	          props.put("mail.smtp.host", host);
//	          props.put("mail.smtp.port", "587");
//	          sendEmail.getEmail(to,from,username,password,props,subject,body);
//	     }
//
//}
