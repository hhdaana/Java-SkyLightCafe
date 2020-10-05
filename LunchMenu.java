// Lunch menu that extends JFrame and Implements actionListener
//importing all classes needed to operate the program including time and date classes
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class LunchMenu extends JFrame implements ActionListener 
{
   //declaring variables
   int T = 0;
   double Addingmeals = 0;
   String[] meals = {"Vegetable Tray and Dip","Smokies in BBQ Sauce (3 per order)","Chicken Wings (3 per order)","Swedish Meatballs (3 per order)","Cheese and Crackers","Fruit Tray","Bacon Wrapped Water Chestnuts (Rumaki) (3 per order)","Italian Meatballs in Sauce","Shrimp on Ice","Mini Tacos","Breaded Cheese Sticks (3 per person)","Breaded Mushrooms (3 per person)","Fruit and Cheese Kabobs (2 per person)"};
   double[] Prices = {2.75, 2.25, 3.00, 2.85, 2.25};
   Lunch Lmenu = new Lunch(meals, Prices);//creating sub class object from parent class
   //creating labels, button, textfields, fonts and checkboxes
   JLabel Main = new JLabel("WELCOME TO THE LUNCH MENU\n");
   JLabel lunchmenu = new JLabel("Please select a Lunch Meal\n");
   Font Headlinefont = new Font("Arial", Font.BOLD, 18);
   Font Headlinefont2 = new Font("Times New Roman", Font.BOLD, 24);
   Font Headlinefont3 = new Font("Times New Roman", Font.BOLD, 22);
   JLabel Icon = new JLabel();
   JLabel Space = new JLabel("***************************************************************************************");
   JLabel Space2 = new JLabel("*******************************************");
   JLabel Space3 = new JLabel("*******************************************");
   JLabel Space4 = new JLabel("*******************************************");
   JLabel Space5 = new JLabel("***************************************************************************************");
   JLabel Space6 = new JLabel("***************************************************************************************");
   //displaying meals and corresponding prices 
   JCheckBox meal1 = new JCheckBox(meals[0]+" $"+Prices[0], false); 
   JCheckBox meal2 = new JCheckBox(meals[1]+" $"+Prices[0], false); 
   JCheckBox meal3 = new JCheckBox(meals[2]+" $"+Prices[1], false); 
   JCheckBox meal4 = new JCheckBox(meals[3]+" $"+Prices[1], false); 
   JCheckBox meal5 = new JCheckBox(meals[4]+" $"+Prices[2], false); 
   JCheckBox meal6 = new JCheckBox(meals[5]+" $"+Prices[0], false); 
   JCheckBox meal7 = new JCheckBox(meals[6]+" $"+Prices[3], false); 
   JCheckBox meal8 = new JCheckBox(meals[7]+" $"+Prices[4], false); 
   JCheckBox meal9 = new JCheckBox(meals[8]+" $"+Prices[4], false); 
   JCheckBox meal10= new JCheckBox(meals[9]+" $"+Prices[0], false); 
   JCheckBox meal11 = new JCheckBox(meals[10]+" $"+Prices[2], false); 
   JCheckBox meal12 = new JCheckBox(meals[11]+" $"+Prices[4], false); 
   JCheckBox meal13 = new JCheckBox(meals[12]+" $"+Prices[2], false); 
   
   JLabel Info = new JLabel("(IF THE DATA IS VALID PLEASE CLICK ON THE WINDOW BORDER TO DISPLAY THE NEXT STEP)");
   JLabel AskingDay = new JLabel("Enter Day of Delivery"); 
   JTextField EnteringDay = new JTextField(5);
   JButton Enter = new JButton("Enter");
   
   JLabel AskingHour = new JLabel("Enter Hour(24  hour clock format)"); 
   JTextField EnteringHour = new JTextField(7);
   JButton HEnter = new JButton("Enter");
   
   JLabel AskingOffice = new JLabel("Enter the Office room Number/Name");
   JTextField EnterOffice = new JTextField(10);
   JButton OButton = new JButton("Enter");
   
   String SavingDay;
   String SavingHour;
   
   
   public LunchMenu()
   {
       super("Lunch Menu");
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setDefaultLookAndFeelDecorated(true);
       setLayout(new FlowLayout());
       //setting all the components
       Icon.setIcon(new ImageIcon("Capture.png"));
       meal1.setFont(Headlinefont);
       meal2.setFont(Headlinefont);
       meal3.setFont(Headlinefont);
       meal4.setFont(Headlinefont);
       meal5.setFont(Headlinefont);
       meal6.setFont(Headlinefont);
       meal7.setFont(Headlinefont);
       meal8.setFont(Headlinefont);
       meal9.setFont(Headlinefont);
       meal10.setFont(Headlinefont);
       meal11.setFont(Headlinefont);
       meal12.setFont(Headlinefont);
       meal13.setFont(Headlinefont);
       Main.setFont(Headlinefont2); 
       lunchmenu.setFont(Headlinefont3); 
       Main.setForeground(Color.BLACK);
       lunchmenu.setForeground(Color.BLACK);
       Info.setFont(new Font("Courier New", Font.ITALIC, 14));
       Info.setForeground(Color.RED);
       EnteringDay.setFont(Headlinefont);
       AskingDay.setFont(Headlinefont);
       Enter.setFont(Headlinefont);
       EnteringHour.setFont(Headlinefont);
       AskingHour.setFont(Headlinefont);
       HEnter.setFont(Headlinefont);
       EnterOffice.setPreferredSize(new Dimension(150, 30));
       EnterOffice.setFont(new Font("Courier New", Font.BOLD, 17));
       AskingOffice.setFont(new Font("Courier New", Font.BOLD, 17));
       OButton.setFont(Headlinefont);
       //adding action listeners to buutons and checkboxes
       meal1.addActionListener(this);
       meal2.addActionListener(this);
       meal3.addActionListener(this);
       meal4.addActionListener(this);
       meal5.addActionListener(this);
       meal6.addActionListener(this);
       meal7.addActionListener(this);
       meal8.addActionListener(this);
       meal9.addActionListener(this);
       meal10.addActionListener(this);
       meal11.addActionListener(this);
       meal12.addActionListener(this);
       meal13.addActionListener(this);
       Enter.addActionListener(this);
       HEnter.addActionListener(this);
       OButton.addActionListener(this);
       //displaying certain components
       add(Icon);
       add(Space2);
       add(Main);
       add(Space);
       add(Space3);
       add(lunchmenu);
       add(Space4);
       add(Info);
       add(meal1);
       add(meal2);
       add(meal3);
       add(meal4);
       add(meal5);
       add(meal6);
       add(meal7);
       add(meal8);
       add(meal9);
       add(meal10);
       add(meal11);
       add(meal12);
       add(Space6);
       add(meal13);
       add(Space5);
       add(AskingDay);
       add(EnteringDay);
       add(Enter);
       
       
   }
    //event handeling
   @Override
   public void actionPerformed(ActionEvent e)
   {
      Object source = e.getSource();
      if(source instanceof JCheckBox)
      {
         if(source == meal1)
         {
            Addingmeals += Prices[0];
         }
         if(source == meal2)
         {
            Addingmeals += Prices[0];
         }
         if(source == meal3)
         {
            Addingmeals += Prices[1];
         }
         if(source == meal4)
         {
            Addingmeals += Prices[1];
         }
         if(source == meal5)
         {
            Addingmeals += Prices[2];
         }
         if(source == meal6)
         {
            Addingmeals += Prices[0];
         }
         if(source == meal7)
         {
            Addingmeals += Prices[3];
         }
         if(source == meal8)
         {
            Addingmeals += Prices[4];
         }
         if(source == meal9)
         {
            Addingmeals += Prices[4];
         }
         if(source == meal10)
         {
            Addingmeals += Prices[0];
         }
         if(source == meal11)
         {
            Addingmeals += Prices[2];
         }
         if(source == meal12)
         {
            Addingmeals += Prices[4];
         }
         if(source == meal13)
         {
            Addingmeals += Prices[2];
         }
      }
         
      if(source instanceof JButton)
      {
         if(source == Enter)
         {
          SavingDay = EnteringDay.getText();
          String Day = EnteringDay.getText();
          LocalDate localDate = LocalDate.now();
          int day = Integer.parseInt(Day);
          if(day < localDate.getDayOfMonth() || day > 31)
          {
           
            EnteringDay.setText("not Valid");
          }else{
            EnteringDay.setText("Valid");
            add(AskingHour);
            add(EnteringHour);
            add(HEnter);
           } 
         }
         if(source instanceof JButton)
         {
           if(source == HEnter)
           {
            //using time class
             LocalTime LTime = LocalTime.now();
             int Lh = LTime.getHour();
             SavingHour = EnteringHour.getText();
             String Hour = EnteringHour.getText();
             int hour = Integer.parseInt(Hour);
             if(hour < 13 || hour > 22)
             {
               EnteringHour.setText("not avialable");
             }else{
               EnteringHour.setText("valid");
               add(AskingOffice);
               add(EnterOffice);
               add(OButton);
              }
             }
          if(source instanceof JButton)
          {
            if(source == OButton)
            { 
             String Off = EnterOffice.getText();
             EnterOffice.setText("Office Entered");
             String Ftotal = String.valueOf(Addingmeals);
             String fDay = SavingDay;
             String FHour = SavingHour;
             JLabel Totalprice =new JLabel("Your Oder will be Delivered to Room "+Off+" On "+fDay+"th at "+FHour+ " O'clock Your Total is $"+Ftotal);
             Totalprice.setFont(new Font("Courier New", Font.BOLD, 17));
             add(Totalprice);
              
              
            }
          }  
   }
  } 
  getContentPane().revalidate();
 }
}
