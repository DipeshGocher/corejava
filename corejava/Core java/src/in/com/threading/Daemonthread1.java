package in.com.threading;

public class Daemonthread1 extends Thread{
	
	String name = null;
	
	public Daemonthread1(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				
			}
			System.out.println(name);
		}
	}
	

}
