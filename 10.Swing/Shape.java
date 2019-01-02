import javax.swing.*;
import java.awt.*;

//Program to draw Shape using Java Swing
//		by Aniruddha

class ShapeDraw extends JPanel
{
	public void ShapeDraw()
	{
		repaint();
	}
	
	public void paintComponent(Graphics g)
	{
		g.setColor(Color.RED);
		g.drawRect(10,15,50,25);
		g.fillRect(30,50,30,40);
		g.drawOval(80,15,50,75);
		g.drawLine(100,125,20,90);
		g.drawArc (30,130,50,100,20,110);
	}
}

public class Shape 
{
	public static void main(String args[])
	{	
		JFrame f = new JFrame("Shapes");
		f.setVisible(true);
		f.setSize(150,175);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ShapeDraw d = new ShapeDraw();
		f.add(d);
		
	}
}


