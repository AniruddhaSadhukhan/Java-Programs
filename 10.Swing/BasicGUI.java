import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BasicGUI extends JFrame{

private JLabel l1, l2, l3;
private JTextField t1;
private JRadioButton rb1, rb2;
private ButtonGroup rbGroup;
private JCheckBox cb1, cb2, cb3;
private JTextArea ta1;
private JButton b1;

public BasicGUI()
{
	super("This is a test on GUI");
	Container c= getContentPane();
	c.setLayout(new FlowLayout());
	
	l1=new JLabel("Name");
	l1.setToolTipText("Enter your name");
	c.add(l1);
	
	t1=new JTextField("Enter Text here", 20);
	c.add(t1);
	
	rb1=new JRadioButton("Male", true);
	c.add(rb1);
	
	rb2=new JRadioButton("Female", false);
	c.add(rb2);
	
	rbGroup=new ButtonGroup();
	rbGroup.add(rb1);
	rbGroup.add(rb2);
	
	l2=new JLabel("Choose your Qualification");
	cb1=new JCheckBox("B.Tech");
	cb2=new JCheckBox("M.Tech");
	cb3=new JCheckBox("Ph.D");
	c.add(l1);
	c.add(cb1);
	c.add(cb2);
	c.add(cb3);
	
	Icon img=new ImageIcon("address.gif");
	l3=new JLabel("Enter Your Address", img, SwingConstants.LEFT);
	c.add(l3);
	ta1=new JTextArea(10,15);
	c.add(ta1);
	
	b1=new JButton("Show");
	c.add(b1);
	
	ButtonHandler handler=new ButtonHandler();
	b1.addActionListener(handler);
	
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	pack();
	setVisible(true);
	}
	
	public static void main(String args[])
	{
	 new BasicGUI();
	}
	private class ButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String str="";
			str+=l1.getText()+":";
			str+=t1.getText()+"\n";
			if(rb1.isSelected())
			str+= rb1.getText()+"\n";
			else
			str+= rb2.getText()+"\n";
			if(cb1.isSelected())
			str+= cb1.getText()+",";
			if(cb2.isSelected())
			str+= cb2.getText()+",";
			if(cb3.isSelected())
			str+= cb3.getText()+"\n";
			str+="\nAddress: " +ta1.getText();
			
			JOptionPane.showMessageDialog(null, str);
		}
	}	
}		
			
		
	
	
	
	