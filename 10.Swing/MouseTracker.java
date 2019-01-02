import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseTracker extends JFrame implements MouseListener, MouseMotionListener
{
	private JLabel statusBar;
	public MouseTracker()
	{
	 super("Demonstrating Mouse Event");
	 
	 statusBar=new JLabel();
	 getContentPane().add(statusBar, BorderLayout.SOUTH);
	 
	 addMouseListener(this);
	 addMouseMotionListener(this);
	 
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	 setSize(275,100);
	 setVisible(true);
	 }
	 
	 public void mouseClicked(MouseEvent e)
	 {
		statusBar.setText("Clicked at ["+e.getX()+","+e.getY()+"]");
	 }
	 
	 public void mousePressed(MouseEvent e)
	 {
		statusBar.setText("Pressed at ["+e.getX()+","+e.getY()+"]");
	 }
	 
	 public void mouseReleased(MouseEvent e)
	 {
		statusBar.setText("Released at ["+e.getX()+","+e.getY()+"]");
	 }
	 
	 public void mouseEntered(MouseEvent e)
	 {
		statusBar.setText("Mouse in Window");
	 }
	 
	  public void mouseExited(MouseEvent e)
	 {
		statusBar.setText("Mouse outside Window");
	 }
	 
	 //MouseMotionListener event handler
	 
	 public void mouseDragged(MouseEvent e)
	 {
		statusBar.setText("Dragged at ["+e.getX()+","+e.getY()+"]");
	 }
	 
	 public void mouseMoved(MouseEvent e)
	 {
		statusBar.setText("Moved at ["+e.getX()+","+e.getY()+"]");
	 }
	 
	 public static void main(String args[])
	{
	 new MouseTracker();
	}
}