package socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
public static void main(String []args)
{
	Socket s=null;
	ServerSocket s2=null;
	System.out.println("Server is getting loaded......");
	
	try {
		s2=new ServerSocket(9999);
		while(true)
		{
			s=s2.accept();
			System.out.println("Connected:");
		    ServerThread st=new ServerThread(s);
		    st.start();
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	
	
}
}
