package socket;

import java.io.DataInputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class user1 {
public static void main(String[] args)
{
	String l=null;
	  DataInputStream ds=null;
	  DataInputStream br=null;
	  Socket s1=null;
	  PrintWriter os=null;
	  try {
		  s1=new Socket("localhost",9999);
		  br=new DataInputStream(System.in);
		  ds=new DataInputStream(s1.getInputStream());
		  os=new PrintWriter(s1.getOutputStream());
	  }
	  catch(Exception e)
	  {
		  
	  }
	  System.out.println("Enter msg to server and type Exit to quit: ");
	  String resp=null;
	 try {
		 l=br.readLine();
		 while(!l.equals("Exit"))
		 {
			 os.println(l);
			  os.flush();
			  resp=ds.readLine();
			  System.out.println("The message from server is: "+resp);
			  l=br.readLine();
		 }
		 ds.close();
		 os.close();
		 s1.close();
		 br.close();
		  System.out.println("Connection close: ");
	 }
	 catch(Exception e)
	 {
		 
	 }
}
}
