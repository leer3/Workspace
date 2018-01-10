
public class Rectangle extends AbstractFigure{

	private double length; double width;
	
	public Rectangle(double length, double width){
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double getArea() {
		return length * width;
	}
	@Override
	public double getPerimeter() {
		return length + length + width + width;
	}

}
