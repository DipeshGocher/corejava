package in.com.threading;

public class SetgetThread {
	public static void main(String[] args) {
		
		System.out.println("program start");
		
		
		//  for get thread
		
		Thread t = Thread.currentThread();
//		String tname = t.getName();
		System.out.println(t.getName());
		
		// for set thread
		
		t.setName("my thread");
		System.out.println(t.getName());
		
	//	for get id
		
		System.out.println(t.getId());
		System.out.println(t.getId());
		
		System.out.println("program end");
		}
        }
