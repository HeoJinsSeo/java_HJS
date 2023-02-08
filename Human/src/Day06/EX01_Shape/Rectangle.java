package Day06.EX01_Shape;

public class Rectangle extends Shape {

	double width, height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
		
		
	}

	@Override
	double area() {
		// 
		return width*height;
	}

	@Override
	double round() {
		// TODO Auto-generated method stub
		return width*4;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	
		
		
		
	}
	
	
	
