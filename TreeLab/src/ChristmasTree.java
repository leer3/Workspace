import java.awt.Graphics;

public class ChristmasTree extends PineTree{

	private Ornament ornament;
	public ChristmasTree(int xPos, int yPos) {
		super(xPos, yPos);
		ornament = new Ornament(xPos, yPos);
		// TODO Auto-generated constructor stub
	}
	
	public void drawTree(Graphics g){
		super.drawTree(g);
		ornament.drawOrnaments(g);
	}
}
