
import java.awt.Graphics;

public class OakTree extends AbstractTree{

	public OakTree(int xPos, int yPos) {
		super(xPos, yPos);
	}

	@Override
	public void drawLeaves(Graphics g) {
		g.setColor(getLeaves());
		g.fillOval(getXPos() - 100, getYPos() - 200, 300, 250);
		
	}

}
