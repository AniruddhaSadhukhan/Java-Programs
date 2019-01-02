import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class AniApplet extends Applet implements MouseListener,MouseMotionListener
{
	int x=120,y=25;
	String msg = "Mouse Events";
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	
	public void mouseEntered(MouseEvent m)
	{
		showStatus("Mouse Entered");
	}
	
	public void mouseExited(MouseEvent m)
	{
		showStatus("Mouse Exited");
	}
	
	public void mouseReleased(MouseEvent m)
	{
		showStatus("Mouse Released");
	}
	
	public void mousePressed(MouseEvent m)
	{
		showStatus("Mouse Pressed");
	}
	
	public void mouseClicked(MouseEvent m)
	{
		showStatus("Mouse Clicked");
	}
	
	public void mouseMoved(MouseEvent m)
	{
		showStatus("Mouse Moved");
	}
	
	public void mouseDragged(MouseEvent m)
	{
		showStatus("Mouse Dragged");
	}
	
	public void paint(Graphics g)
	{
		setBackground(Color.yellow);
		g.setColor(Color.red);
		g.fillRect(75,75,200,150);
		g.setColor(Color.blue);
		g.drawOval(100,100,150,100);
		g.drawRect(50,50,250,200);
		g.setColor(Color.black);
		g.drawString(msg,x,y);
	}
}
