import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BasicEventHandling extends JFrame{

private JTextField t1;
private JRadioButton rb1, rb2;
private ButtonGroup rbGroup;
private JCheckBox cb1, cb2;
private JButton b1;

public BasicEventHandling()
{
	super("This is a test on GUI");
	Container c= getContentPane();
	c.setLayout(new FlowLayout());
	
		
	t1=new JTextField("Watch the font style change", 20);
	t1.setFont(new Font("Verdana",Font.PLAIN,14));
	t1.setForeground(Color.BLUE);
	c.add(t1);
	
	rb1=new JRadioButton("TimesRoman", false);
	c.add(rb1);
	
	rb2=new JRadioButton("Vardana", false);
	c.add(rb2);
	
	rbGroup=new ButtonGroup();
	rbGroup.add(rb1);
	rbGroup.add(rb2);
	
	
	cb1=new JCheckBox("Bold");
	cb2=new JCheckBox("Italic");
	c.add(cb1);
	c.add(cb2);
	
	
	ToggleButtonHandler handler=new ToggleButtonHandler();
	cb1.addItemListener(handler);
	cb2.addItemListener(handler);
	rb1.addItemListener(handler);
	rb2.addItemListener(handler);
	
	
	b1=new JButton("Done");
	c.add(b1);
	b1.addActionListener( new ActionListener() {
		public void actionPerformed(ActionEvent e)
		{
			JOptionPane.showMessageDialog(null, "You Pressed:"+e.getActionCommand());
		}
	}
	);
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	pack();
	setVisible(true);
	}
	
	public static void main(String args[])
	{
	 new BasicEventHandling();
	}
	private class ToggleButtonHandler implements ItemListener
	{
		private int valBold=Font.PLAIN;
		private int valItalic=Font.PLAIN;
		
		public void itemStateChanged(ItemEvent e)
		{
			if(e.getSource()== cb1)
				if(e.getStateChange()== ItemEvent.SELECTED)
					valBold=Font.BOLD;
			else
				valBold=Font.PLAIN;
				
			if(e.getSource()== cb2)
				if(e.getStateChange()== ItemEvent.SELECTED)
					valItalic=Font.ITALIC;
			else
				valItalic=Font.PLAIN;
				
			if (e.getSource()== rb1)
				t1.setFont( new Font("TimesRoman", valBold+valItalic, 12));
			else if(e.getSource()== rb2)
				t1.setFont( new Font("Vardana", valBold+valItalic, 12));
				
			t1.repaint();
				
		}
	}	
}		