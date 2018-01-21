import java.awt.Color;
import java.awt.Graphics;

public abstract class AbstractTree implements Tree{
	
	private Color trunk, leaves;
	private int xPos; int yPos;
	
	public AbstractTree(int xPos, int yPos){
		this.xPos = xPos;
		this.yPos = yPos;
		leaves = new Color(49, 150, 54);
		trunk = new Color(132, 107, 67);
	}
	
	public int getXPos(){
		return xPos;
	}
	public void setXPos(int xPos){
		this.xPos = xPos;
	}
	public int getYPos(){
		return yPos;
	}
	public void setYPos(int yPos){
		this.yPos = yPos;
	}
	public Color getLeaves(){
		return leaves;
	}
	public void setLeaves(Color leaves){
		this.leaves = leaves;
	}
	
	public void drawTrunk(Graphics g){
		g.setColor(trunk);
		g.fillRect(xPos, yPos, 100, 400);
		
	}
	public void drawTree(Graphics g){
		drawTrunk(g);
		drawLeaves(g);
	}
	public abstract void drawLeaves(Graphics g);
}
