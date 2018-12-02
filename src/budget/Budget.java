
package budget;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class Budget extends JFrame implements ActionListener {
	
	private JLabel Holiday, Bills, Ent, Subs, Kids, Food, Clothing, Misc, Income;
	public JTextField HolidayT, BillsT, EntT, SubsT, KidsT, FoodT, ClothingT, MiscT, IncomeT;
	JButton  Submit , Clear;
	JPanel M;
	Double Money,Remain,Spent,Ho,Bi,En,Sub,Ki,Fo,Clo,Mi;
	

	
    public Budget() {
    	JPanel Main = new JPanel();
    	
    	Main.setLayout(new GridBagLayout());
    	
       	GridBagConstraints c = new GridBagConstraints();

    	c.fill = GridBagConstraints.HORIZONTAL;
    	
    	
    	Holiday = new JLabel("Holiday");
       	c.gridx = 0;
    	c.gridy = 0;
   
    	Main.add(Holiday,c);
    	
    	HolidayT = new JTextField(12);
    	c.gridx = 1;
    	c.gridy = 0;
      	
    	Main.add(HolidayT,c);
    	    	
    	Bills = new JLabel("Bills");
    	c.gridx = 0;
    	c.gridy = 1;
    	
    	Main.add(Bills, c);
    	
    	BillsT = new JTextField(12);
    	c.gridx = 1;
    	c.gridy = 1;
    	
    	Main.add(BillsT,c);
    	
    	Ent = new JLabel("Entertainment");
    	c.gridx = 0;
    	c.gridy = 2;
    	
    	Main.add(Ent, c);
    	
    	EntT = new JTextField(12);
    	c.gridx = 1;
    	c.gridy = 2;
    	
    	Main.add(EntT,c);
    	
    	Subs = new JLabel("Subscriptions");
    	c.gridx = 0;
    	c.gridy = 3;
    	
    	Main.add(Subs, c);
    	
    	SubsT = new JTextField(12);
    	c.gridx = 1;
    	c.gridy = 3;
    	
    	Main.add(SubsT,c);
    	
    	Kids = new JLabel("Kids");
    	c.gridx = 0;
    	c.gridy = 4;
    	
    	Main.add(Kids, c);
    	
    	KidsT = new JTextField(12);
    	c.gridx = 1;
    	c.gridy = 4;
    	
    	Main.add(KidsT,c);
    	
    	Food = new JLabel("Food");
    	c.gridx = 0;
    	c.gridy = 5;
    	
    	Main.add(Food, c);
    	
    	FoodT = new JTextField(12);
    	c.gridx = 1;
    	c.gridy = 5;
    	
    	Main.add(FoodT,c);
    	
    	Clothing = new JLabel("Clothing");
    	c.gridx = 0;
    	c.gridy = 6;
    	
    	Main.add(Clothing, c);
    	
    	ClothingT = new JTextField(12);
    	c.gridx = 1;
    	c.gridy = 6;
    	
    	Main.add(ClothingT,c);
    	
    	Misc = new JLabel("Misc");
    	c.gridx = 0;
    	c.gridy = 7;
    	
    	Main.add(Misc, c);
    	
    	MiscT = new JTextField(12);
    	c.gridx = 1;
    	c.gridy = 7;
    	
    	Main.add(MiscT,c);
    	
    	Income = new JLabel("Total Income");
    	c.gridx= 0;
    	c.gridy = 8;
       	Main.add(Income,c);
    	
    	IncomeT = new JTextField(12);
    	c.gridx = 1;
    	c.gridy = 8;
    	Main.add(IncomeT, c);
    	
    	Submit = new JButton("Submit");
    	c.gridx= 1;
    	c.gridy = 9;
    	Main.add(Submit,c);
    	
     	Submit.addActionListener(this);
     	
     	Clear = new JButton("Clear");
     	c.gridx=0;
     	c.gridy=9;
     	Main.add(Clear,c);
     	
     	Clear.addActionListener(this);
     	
    	
    
    add(Main);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	setSize(500,500);
    	setVisible(true);
    	setTitle("Let's Save!");
    }
    	
    public void actionPerformed (ActionEvent e) {
    		
    	if(e.getSource()==Submit) {
    		
    		if (BillsT.getText().equals("")) {
    			JOptionPane.showMessageDialog(null, "All fields must have a value if. If no value is need put 0");
    		}
    		else if (HolidayT.getText().equals("")) {
    			JOptionPane.showMessageDialog(null, "All fields must have a value if. If no value is need put 0");
    			
    		}
    		else if (EntT.getText().equals("")) {
    			JOptionPane.showMessageDialog(null, "All fields must have a value if. If no value is need put 0");
    			
    		}
    		else if (SubsT.getText().equals("")) {
    			JOptionPane.showMessageDialog(null, "All fields must have a value if. If no value is need put 0");
    			
    		}
    		else if (KidsT.getText().equals("")) {
    			JOptionPane.showMessageDialog(null, "All fields must have a value if. If no value is need put 0");
    			
    		}
    		else if (FoodT.getText().equals("")) {
    			JOptionPane.showMessageDialog(null, "All fields must have a value if. If no value is need put 0");
    			
    		}
    		else if (ClothingT.getText().equals("")) {
    			JOptionPane.showMessageDialog(null, "All fields must have a value if. If no value is need put 0");
    			
    		}
    		else if (MiscT.getText().equals("")) {
    			JOptionPane.showMessageDialog(null, "All fields must have a value if. If no value is need put 0");
    			
    		}
    		else if(IncomeT.getText().equals("")) {
    			JOptionPane.showMessageDialog(null, "All fields must have a value if. If no value is need put 0");
    		}
    		else {
    			
    		double Bi = Double.parseDouble(BillsT.getText());
    		 double Ho = Double.parseDouble(HolidayT.getText());
    		 double En = Double.parseDouble(EntT.getText());
    		 double Sub = Double.parseDouble(SubsT.getText());
    		 double Ki = Double.parseDouble(KidsT.getText());
    		 double Fo = Double.parseDouble(FoodT.getText());
    		 double Clo = Double.parseDouble(ClothingT.getText());
    		 double Mi = Double.parseDouble(MiscT.getText());
    		 double Money = Double.parseDouble(IncomeT.getText());
    		 Spent = Bi+Ho+En+Sub+Ki+Fo+Clo+Mi;
    		 Remain = Money-Spent;
    	   	
    		JOptionPane.showMessageDialog(null, "Total Amount of Income :  " + Money + "\nTotal amount of Expenses : " + Spent + "\nRemaining Income after expenses : " + Remain  );
    		}
    	}
    		 /*else if (Spent > Money) {
    				JOptionPane.showMessageDialog(null, "Your spending amount is higher than your income");
    				}*/
    		else if (e.getSource()==Clear) {
			HolidayT.setText(" ");
			BillsT.setText(" ");
			EntT.setText(" ");
			SubsT.setText(" ");
			KidsT.setText(" ");
			FoodT.setText(" ");
			ClothingT.setText(" ");
			MiscT.setText(" ");
			IncomeT.setText(" ");	
			}
    		}
    	   		 /*try {
    			 JOptionPane.showMessageDialog(null, "Spent:" + (Bi+Ho+En+Sub+Ki+Fo+Clo+Mi));
        		 }
    	
    		 catch (NumberFormatException emptyField){
    			 JOptionPane.showMessageDialog(null, "All fields must have a value if. If no value is need put 0");*/
    		 
    	
    
    	public static void main(String[] args) {
    		javax.swing.SwingUtilities.invokeLater(new Runnable() {
    			
    			@Override
    			public void run() {
    				Budget GUI = new Budget();
    			}
    		});
    	}
    }
