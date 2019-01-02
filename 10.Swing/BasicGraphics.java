import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BasicGraphics extends JFrame 
{
public BasicGraphics()
{
	super("Demonstrating Graphic methods");
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(500,500);
	setVisible(true);
}

public void paint(Graphics g)
{

	/*g.setColor(Color.red);
	g.setFont(new Font("SansSerif", Font.BOLD, 14));
	g.drawString("Working With Graphics", 50,50);*/
	
	g.setColor(Color.red);
	g.drawLine(5,30,350,30);
	
	g.setColor(Color.green);
	g.drawRect(5,40,90,55);
	g.fillRect(100,40,90,55);
	
	g.setColor(Color.cyan);
	g.drawRoundRect(290,40,90,55,20,20);
	g.fillRoundRect(195,40,90,55,50,50);
	
	g.setColor(Color.yellow);
	g.draw3DRect(5,100,90,55,true);
	g.fill3DRect(100,100,90,55,true);
	
	g.setColor(Color.magenta);
	g.drawOval(195,100,90,55);
	g.fillOval(290,100,90,55);
	
	g.setColor(Color.black);
	g.drawRect(300,200,80,80);
	g.setColor(Color.red);
	g.drawArc(300,200,80,80,0,360);
	
	g.setColor(Color.black);
	g.drawRect(180,200,80,80);
	g.setColor(Color.green);
	g.drawArc(180,200,80,80,0,-270);
	
	g.setColor(Color.cyan);
	g.fillArc(100,200,80,40,270,-90);
	
	g.setColor(Color.magenta);
	g.fillArc(10,200,80,40,0,110);
}
	

public static void main(String args[])
{
	new BasicGraphics();
}
}