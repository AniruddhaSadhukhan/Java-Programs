import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyDemo extends JFrame implements KeyListener
{
private String l1, l2, l3;
private JTextArea ta;

public KeyDemo()
{
	super("Demonstrating key stroke events");
	ta= new JTextArea(10,15);
	ta.setText("press any key");
	ta.setEditable(false);
	
	ta.addKeyListener(this);
	
	getContentPane().add(ta);
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(350,100);
	setVisible(true);
}

public void keyPressed(KeyEvent e)
{

	l1="Key Pressed : "+e.getKeyText(e.getKeyCode());
	setTextArea(e);
}

public void keyReleased(KeyEvent e)
{

	l1="Key Released : "+e.getKeyText(e.getKeyCode());
	setTextArea(e);
}

public void keyTyped(KeyEvent e)
{
	
	l1="Key Typed"+e.getKeyChar();
	setTextArea(e);
}

private void setTextArea(KeyEvent e)
{
	l2="This key is "+(e.isActionKey() ? " " : " not " )+"an action key";
	
	String temp=e.getKeyModifiersText(e.getModifiers());
	
	l3="Modifier key pressed : "+(temp.equals("")? " none " : " "+temp);
	
	ta.setText(l1+"\n"+l2+"\n"+l3+"\n");
}

public static void main(String args[])
{
	new KeyDemo();
}
}
