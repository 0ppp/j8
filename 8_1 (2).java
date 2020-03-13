import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class s8_1 extends JFrame implements ItemListener
{
JComboBox cb1,cb2;
JLabel l1,l2,l3;
JCheckBox cbold,citalic;
JTextField tf;

		public s8_1(String titlee)
		{
		
		super(titlee);
		setLayout(null);
			cb1=new JComboBox(); 
			cb2= new JComboBox(); 
		
		 l1= new JLabel("Font"); l1.setBounds(30,30,100,30);		
		 l2= new JLabel("Style"); l2.setBounds(160,30,100,30);
		 l3= new JLabel("Size"); l3.setBounds(30,110,100,30);
		 
		
		cb1.addItem("Fixedsys");
		   cb1.addItem("Times New Roman");
		       cb1.addItem("Segoe Script");
	   cb1.setBounds(30,60,100,30);
		
		cb2.addItem("5");
			cb2.addItem("6");
				cb2.addItem("7");
					cb2.addItem("8");
						cb2.addItem("9");
							cb2.addItem("10");
	    cb2.setBounds(30,140,100,30);
		
         tf= new  JTextField(300); tf.setBounds(30,200,300,30);
		 		 
		 cbold= new JCheckBox("Bold"); cbold.setBounds(160,70,100,30);
		 citalic= new JCheckBox("Italic"); citalic.setBounds(160,110,100,30);
		 
		 add(cb1);add(cb2);add(l1);add(l2);add(l3);add(cbold);add(citalic);add(tf);
		 
		 cb1.addItemListener(this);
		 cb2.addItemListener(this);
		 cbold.addItemListener(this);
		 citalic.addItemListener(this);
		 
		 
		 setVisible(true);
		 setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		 setSize(380,300);
		 setLocation(200,200);
		}
		
	public void itemStateChanged(ItemEvent ie)
	{
	
		
		 if(cbold.isSelected()&&citalic.isSelected())
			{
				tf.setFont(new Font((String)cb1.getSelectedItem(),Font.BOLD+Font.ITALIC,Integer.parseInt((String)cb2.getSelectedItem())+10));
			}
			
			else if(citalic.isSelected()&&!cbold.isSelected())
		{
		tf.setFont(new Font((String)cb1.getSelectedItem(),Font.ITALIC,Integer.parseInt((String)cb2.getSelectedItem())+10));	
		}
		else if(cbold.isSelected()&&!citalic.isSelected())
	{
	tf.setFont(new Font((String)cb1.getSelectedItem(),Font.BOLD,Integer.parseInt((String)cb2.getSelectedItem())+10));	
	}
		else
		tf.setFont(new Font((String)cb1.getSelectedItem(),Font.PLAIN,Integer.parseInt((String)cb2.getSelectedItem())+10));		
	}

public static void main(String args[])
{
new s8_1("Slip 8 ");
}

}




