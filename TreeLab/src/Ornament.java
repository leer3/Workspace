import java.awt.Color;
import java.awt.Graphics;

public class Ornament {

	private int xPos;
	private int yPos;
	private Color color;
	
	public Ornament(int xPos, int yPos){
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
	private Color getRandColor(){  
        int R = (int) (Math.random() * 256);
        int G = (int) (Math.random() * 256);
        int B = (int) (Math.random() * 256);

        Color color = new Color(R,G,B);

        return color;
    }
	
	public void drawOrnaments(Graphics g){
		g.setColor(getRandColor());
		g.fillOval(xPos + 25, yPos - 100, 30, 30);
		g.setColor(getRandColor());
		g.fillOval(xPos - 40, yPos + 65, 30, 30);
		g.setColor(getRandColor());
		g.fillOval(xPos + 75, yPos + 45, 30, 30);
	}
}
