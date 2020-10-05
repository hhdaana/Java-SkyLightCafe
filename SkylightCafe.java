//the application that runs the program
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

//Using Lambda Expression
interface Arithmetic {
	int operation(int a, int b);
}

   public class SkylightCafe extends JFrame
{
   public static void main(String args[]){
   
   int choice;
   //Lambda Expression to initialize Choice.
   Arithmetic subtraction = (int a, int b) -> (a - b);
   choice = subtraction.operation(4, 3);
   
   //giving the user a choice to pick (Breakfast/Lunch)
   Object[] Choices = {"Breakfast", "Lunch"};
   choice = JOptionPane.showOptionDialog(null, "What would you like your meal to be", "MEALS",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,Choices,Choices[0]);
   
   if(choice == 1) 
   {
      //Creating  Array Objects for Lunch
     LunchMenu[] Lmenu = new LunchMenu[2];
     Lmenu[0] = new LunchMenu();
     Lmenu[0].setSize(1000, 900); 
     Lmenu[0].setVisible(true); 
     Lmenu[0].getContentPane().setBackground(Color.YELLOW);
   }else
   {
     //Creating Array of Objects for Breakfast
     BreakfastMenu[] Bmenu = new BreakfastMenu[2];
     Bmenu[0] = new BreakfastMenu();
     Bmenu[0].setSize(1000, 900); 
     Bmenu[0].setVisible(true); 
     Bmenu[0].getContentPane().setBackground(Color.ORANGE);     
   } 
  }
}
   
   