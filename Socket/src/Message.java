

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Message implements Runnable{

	Socket socket;
	

	public Message(Socket socket) {
		super();
		this.socket = socket;
	}

	public void run() {
		InputStream in;
		try {
			in = socket.getInputStream();
			 
			byte[] bytes = new byte[in.available()];
			in.read(bytes);
			System.out.println(new String(bytes,"utf-8"));
			in.close();
		} catch (IOException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}

}
