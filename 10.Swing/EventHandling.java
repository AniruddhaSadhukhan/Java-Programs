import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventHandling extends JFrame{

private JLabel l1, l2, l3;
private JTextField t1;
private JRadioButton rb1, rb2;
private ButtonGroup rbGroup;
private JCheckBox cb1, cb2, cb3;
private JTextArea ta1;
private JButton b1;

public EventHandling()
{
	super("This is a test on GUI");
	Container c= getContentPane();
	c.setLayout(new BorderLayout(100,100));
	
	JPanel p1= new JPanel();
	p1.setLayout(new BorderLayout(10,10));
	c.add(p1, BorderLayout.NORTH);
	
	l1=new JLabel("Name");
	l1.setToolTipText("Enter your name");
	p1.add(l1, BorderLayout.NORTH);
	
	t1=new JTextField("Enter Text here", 5);
	p1.add(t1, BorderLayout.SOUTH);
	
	JPanel p2= new JPanel();
	p2.setLayout(new BorderLayout(10,10));
	c.add(p2,BorderLayout.EAST);
	
	rb1=new JRadioButton("Male", true);
	p2.add(rb1,BorderLayout.EAST);
	
	rb2=new JRadioButton("Female", false);
	p2.add(rb2,BorderLayout.WEST);
	
	rbGroup=new ButtonGroup();
	rbGroup.add(rb1);
	rbGroup.add(rb2);
	
	JPanel p3= new JPanel();
	p3.setLayout(new BorderLayout(10,10));
	c.add(p3, BorderLayout.CENTER);
	
	l2=new JLabel("Choose your Qualification");
	cb1=new JCheckBox("B.Tech");
	cb2=new JCheckBox("M.Tech");
	cb3=new JCheckBox("Ph.D");
	p3.add(l1,BorderLayout.NORTH);
	p3.add(cb1,BorderLayout.EAST);
	p3.add(cb2,BorderLayout.CENTER);
	p3.add(cb3,BorderLayout.WEST);
	
	JPanel p4= new JPanel();
	p4.setLayout(new BorderLayout(10,10));
	c.add(p4, BorderLayout.SOUTH);
	
	Icon img=new ImageIcon("address.gif");
	l3=new JLabel("Enter Your Address", img, SwingConstants.LEFT);
	p4.add(l3, BorderLayout.NORTH);
	ta1=new JTextArea(10,15);
	p4.add(ta1,BorderLayout.CENTER);
	
	b1=new JButton("Show");
	p4.add(b1,BorderLayout.SOUTH);
	
	ButtonHandler handler=new ButtonHandler();
	b1.addActionListener(handler);
	
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	pack();
	setVisible(true);
	}
	
	public static void main(String args[])
	{
	 new EventHandling();
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
			
		
	
	
	
	