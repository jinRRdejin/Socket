


public class Start {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          new Thread(new Runnable() {
			
			public void run() {
				// TODO Auto-generated method  stub
				new Client().sendMessage();
			}
		}).start();
          
          new Thread(new Runnable() {
			
			public void run() {
				// TODO Auto-generated method stub
				new Server().acceptMessage();
			}
		}).start();
	}

}
