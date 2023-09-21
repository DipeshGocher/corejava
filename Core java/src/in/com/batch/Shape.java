package in.com.batch;

public class Shape {

	private int borderwidth=0;
	private String color=null;
	
	public Shape() {
	}
	  public Shape(int borderwidth, String color) {
		  this.borderwidth = borderwidth;
		  this.color = color;
	  }
	  public void SetBorderWidth(int borderwidth) {
		  this.borderwidth=borderwidth;
	  }
	  public int getBorderWidth() {
		  return borderwidth;
	  }
	  public void SetColor(String color) {
		  this.color = color;
	  }
	  public String getColor() {
		  return color;
	  }
	  
		  
		  
		  
		
	}

