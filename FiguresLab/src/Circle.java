
public class Circle extends AbstractFigure{

	private double radius;
	
	public Circle(double radius){
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return Math.PI * radius % 2;
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
}
