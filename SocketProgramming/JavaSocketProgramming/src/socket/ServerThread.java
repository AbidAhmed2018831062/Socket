package socket;

import java.io.DataInputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerThread extends Thread {
  String l=null;
  DataInputStream ds=null;
  DataInputStream br=null;
  Socket s1=null;
  PrintWriter os=null;
  
  ServerThread(Socket s)
  {
	  this.s1=s;
  }
  public void run()
  {
	  try {
		  ds=new DataInputStream(s1.getInputStream());
		  os=new PrintWriter(s1.getOutputStream());
		  l=ds.readLine();
		  while(!l.equals("Exit"))
		  {
			  os.println(l);
			  os.flush();
			  System.out.println("The message from client is: "+l);
			  l=ds.readLine();
			  
		  }
		  
		  ds.close();
		  os.close();
		  s1.close();
	  }
	  catch(Exception e)
	  {
		  
	  }
  }
}
