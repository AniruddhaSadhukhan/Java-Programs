import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Program to design a form for displaying bio data using Java Swing
//		by Aniruddha

class Biodata extends JFrame
{
	private JLabel l1,l2,l3;
	private JTextField n;
	private JRadioButton r1,r2;
	private ButtonGroup g;
	private JCheckBox c1,c2,c3;
	private JTextArea a;
	private JButton b;
	
	
	Biodata()
	{
		super("Enter Biodata");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		l1 = new JLabel("Name");
		c.add(l1);
		
		n = new JTextField("Enter your name",20);
		n.setToolTipText("Please enter your name");
		c.add(n);
		
		r1 = new JRadioButton("Male",true);
		c.add(r1);
		r2 = new JRadioButton("Female",false);
		c.add(r2);
		
		g = new ButtonGroup();
		g.add(r1);
		g.add(r2);
		
		l2 = new JLabel("Qualification");
		c.add(l2);
		
		c1 = new JCheckBox("BTech");
		c.add(c1);
		c2 = new JCheckBox("MTech");
		c.add(c2);
		c3 = new JCheckBox("MCA");
		c.add(c3);
		
		l3 = new JLabel("Address");
		c.add(l3);
		
		a = new JTextArea(10,15);
		c.add(a);
		
		b = new JButton("Show");
		c.add(b);
		
		
		Handler h = new Handler();
		b.addActionListener(h);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pack();
		setVisible(true);
	}
	
	
	class Handler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String s = ""+n.getText()+"\n";
			s += (r1.isSelected())?r1.getText()+"\n":r2.getText() +"\n";
			if(c1.isSelected()) s += (c1.getText()) + "  ";
			if(c2.isSelected()) s += (c2.getText()) + "  ";
			if(c3.isSelected()) s += (c3.getText());
			s += "\n"+a.getText()+"\n";
			
			JOptionPane.showMessageDialog(null,s);
		}
	}
	
	
	public static void main(String args[])
	{	
		new Biodata();
	}
}


