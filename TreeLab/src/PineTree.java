import java.awt.Graphics;

public class PineTree extends AbstractTree{

	public PineTree(int xPos, int yPos) {
		super(xPos, yPos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void drawLeaves(Graphics g) {
		int[] xPoint = {getXPos() + 50, getXPos() - 60,getXPos() + 160};
		int[] yPoint = {getYPos() - 200, getYPos() + 100,getYPos() + 100};
		g.setColor(getLeaves());
		g.fillPolygon(xPoint, yPoint, 3);
	}
}
