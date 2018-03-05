import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;


public class Message implements Runnable{
	
	Socket socket;

	public Message(Socket socket){
		this.socket = socket;
	}

	public void run() {

		InputStream in;
		try {
			in = socket.getInputStream();
			
			int len = in.available();
			
			while(len == 0){
				
				Thread.sleep(100);
				len = in.available();
			}
			byte[] bytes = new byte[len];
			in.read(bytes);
			System.out.println(new String(bytes,"utf-8"));
			in.close();
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
		
	}

	
}
