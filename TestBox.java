package day2.ClassAobject;

public class TestBox {

	public static void main(String[] args) {
		
		Box green= new Box();
		Box red = new Box();
		
		green.length=2;
		green.breadth=2;
		red.length=1;
		red.breadth=1;
		 
		red.calculateArea();
		green.calculateArea();
		
		
	}

}
