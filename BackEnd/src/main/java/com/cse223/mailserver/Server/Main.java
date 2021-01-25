package com.cse223.mailserver.Server;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import com.cse223.mailserver.UsersAndMails.Contact;
import com.cse223.mailserver.UsersAndMails.UserClass;
import com.cse223.mailserver.controller.SaveAndLoad;
import com.cse223.mailserver.controller.signUp;
import org.json.simple.parser.ParseException;

public class Main {

	public static void main(String[] args) throws IOException, ParseException, java.text.ParseException {
		// TODO Auto-generated method stub
		
		File file9 = new File("data_base//"  );
        file9.mkdir();
        File file10 = new File("data_base//"+"accounts"  );
        file10.mkdir();
        
        File indexFileDraft = new File("data_base//"+"accounts//"+"Users.json");
        indexFileDraft.createNewFile();
        
        
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
		
	    Date date = new Date();  
	    signUp signUp=new signUp();
		UserClass user=new UserClass("abdoMohame","12333","Mohamed311@gmail.com","2020");
		//signUp.addUser(user);
		//signUp.readUsersFromJson();
		//System.out.println(signUp.addUser(user));
		ArrayList<String> to=new ArrayList();
		to.add("mailTO1");
		ArrayList<String> attaches=new ArrayList();
		attaches.add("attaches1111");
		SaveAndLoad saveAndLoad1=new SaveAndLoad();
		saveAndLoad1.ClearFileContent("Mohamed311@gmail.com", "sent");
		
		
		/*MessageHeader header = new MessageHeader("Mohamed311@gmail.com",to,"subject11","sent");
	     MessageBody Body = new MessageBody("body1");
	     Attachments Attaches = new Attachments(attaches);
	     MessageCreator myMessage = new MessageCreator(header,Body,Attaches,"2020",4);
	     SaveAndLoad saveAndLoad=new SaveAndLoad();
	     saveAndLoad.sendMessage(myMessage, "sent", "Mohamed311@gmail.com");*/
	//	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/MM/yyyy");  
		
		//   LocalDateTime now = LocalDateTime.now();  
		   //ZonedDateTime d = ZonedDateTime.parse(now);
		 //  LocalDate d2 = LocalDate.parse(dtf.format(now), DateTimeFormatter.ISO_LOCAL_DATE);
		   
		   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println(dtf.format(now).toString());  
		   SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
		    Date firstDate = sdf.parse("1/05/2017");
		    Date secondDate = sdf.parse("30/06/2017");

		    long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
		    long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
		    System.out.println(diff);
		    Server server=Server.getServer();
		    ArrayList<String> Emails=new ArrayList<String>();
		    Emails.add("Sakr");
		    Emails.add("seif");
		    Contact contact=new Contact("Asszeft",Emails);
		    
		    ArrayList<Contact> contactClass;
		    contactClass=saveAndLoad1.readContactsFromJson("Mohamed311@gmail.com");
		    System.out.println(contactClass.get(0).getEmails());
		    
		  // System.out.println(server.EditContact(ContactEmail, newName));
		   
	     

	}

}
