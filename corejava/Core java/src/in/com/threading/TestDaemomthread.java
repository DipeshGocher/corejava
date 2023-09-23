package in.com.threading;

public class TestDaemomthread {
	public static void main(String[] args) {
		
		Daemonthread1 t1 = new Daemonthread1("Daemon thread");
		t1.setDaemon(true);
		t1.start();	
		
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			       e.printStackTrace();
			}
			System.out.println(i + "main");
		}
			
		}

}
