


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {

	 private int port = 10000;
	 private String ip = "";
		 
	public void acceptMessage(){
		ServerSocket server;
		try {
			server = new ServerSocket(port);
			
			while(true){
				
				Socket socket = server.accept();		
				new Thread(new Message(socket)).start();
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
