
public class FiguresTest {

	public static void main(String[] args) {
		
		AbstractFigure r = new Rectangle(3,5);
		System.out.println(r);
		
		AbstractFigure s = new Square(3);
		System.out.println(s);

		AbstractFigure c = new Circle(3);
		System.out.println(c);
	}

}
