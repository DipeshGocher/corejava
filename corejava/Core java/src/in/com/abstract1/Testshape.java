package in.com.abstract1;

public class Testshape {
	public static void main(String[] args) {
		
		Shape s= new Rectangle();
		s.area();
		Shape.hello();
		
		Rectangle r= (Rectangle)s;
		r.area();
		
	}

}
