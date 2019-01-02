import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GridLayoutDemo extends JFrame{
private JButton b[];
private String names[]={"1","2","3","4","5","6","7","8","9","0"};


public GridLayoutDemo()
{
	super("This is a demo on GridLayout");
	Container c= getContentPane();
	c.setLayout(new GridLayout(4,3,5,5));
	
	b=new JButton[names.length];
	for(int i=0;i<names.length;i++)
	{
		b[i]=new JButton(names[i]);
		b[i].addActionListener( new ActionListener() {
		public void actionPerformed(ActionEvent e)
		{
			JOptionPane.showMessageDialog(null, "You Pressed:"+e.getActionCommand());
		}
	}
	);
	c.add(b[i]);
	}
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	pack();
	setVisible(true);
	}
	
	public static void main(String args[])
	{
	 new GridLayoutDemo();
	}
}	