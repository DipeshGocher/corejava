package in.com.inheritance;

public class Testshaperactangle {
	public static void main(String[] args) {
		
	
	Rectangle r = new Rectangle();
	
	r.setColor("pink");
	r.setBorderWidth(10);
	r.setLength(50);
	r.setWidth(20);
	r.area();
	
    System.out.println(r.getColor());
    System.out.println(r.getBorderWidth());
	System.out.println(r.getWidth());
    System.out.println(r.getLength());
}
}
