
public abstract class AbstractFigure implements Figures{

	public String toString(){
		return String.format("%s - Perimeter: %.2f units, Area: %.2f sq units"
				, getClass().getSimpleName(), getPerimeter(), getArea());
	}
}
