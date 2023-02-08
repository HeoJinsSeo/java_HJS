package Day06.EX01_Shape;

public class Circle extends Shape {

	double radius;
	
	public Circle(double radius) {
		
		this.radius = radius;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}

	@Override
	double round() {
		// TODO Auto-generated method stub
		return 2*Math.PI*radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
	
	
}
