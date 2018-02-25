

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	
	private String ip = "192.168.1.111";
	private int port = 10000;
	public void sendMessage() {
		
		
		Socket socket;
		try {
			
			Scanner scanner = new Scanner(System.in);
			while(true){
				socket = new Socket(ip, port);
				String s = scanner.nextLine();
				OutputStream os = socket.getOutputStream();
				os.write(s.getBytes());
				socket.close();
				os.close();
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

}
