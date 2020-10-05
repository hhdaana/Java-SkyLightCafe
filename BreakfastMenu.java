// breakfast menu that extends JFrame and Implements actionListener
//importing all classes needed to operate the program including time and date classes
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class BreakfastMenu extends JFrame implements ActionListener 
{
   //declaring variables
   int T = 0;
   double Addingmeals = 0;
   String[] meals = {"Assorted Bottled Chilled Fruit Juices","Bagels and Cream Cheese","Coffee (regular or decaf)","Fresh Fruit Bowl","Hot Tea","The Classical Continental","The Executive Breakfast","The Skylight Cafe Brunch Buffet"};
   double[] Prices = {1.50, 8.00, 2.00, 5.00, 7.75, 8.75};
   Breakfast Bmenu = new Breakfast(meals, Prices);//creating sub class object
   //creating labels, button, textfields, fonts and checkboxes
   JLabel Main = new JLabel("WELCOME TO THE BREAKFAST MENU\n");
   JLabel BreakfastMenu = new JLabel("Please select a Breakfast Meal\n");
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
   JCheckBox meal4 = new JCheckBox(meals[3]+" $"+Prices[2], false); 
   JCheckBox meal5 = new JCheckBox(meals[4]+" $"+Prices[0], false); 
   JCheckBox meal6 = new JCheckBox(meals[5]+" $"+Prices[3], false); 
   JCheckBox meal7 = new JCheckBox(meals[6]+" $"+Prices[4], false); 
   JCheckBox meal8 = new JCheckBox(meals[7]+" $"+Prices[5], false);
    
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
   
   
   public BreakfastMenu()
   {
       super("Breakfast Menu");
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
       meal8.setFont(Headlinefont);;
       Main.setFont(Headlinefont2); 
       BreakfastMenu.setFont(Headlinefont3); 
       Main.setForeground(Color.BLACK);
       BreakfastMenu.setForeground(Color.BLACK);
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
       Enter.addActionListener(this);
       HEnter.addActionListener(this);
       OButton.addActionListener(this);
        //displaying certain components
       add(Icon);
       add(Space2);
       add(Main);
       add(Space);
       add(Space3);
       add(BreakfastMenu);
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
            Addingmeals += Prices[2];
         }
         if(source == meal5)
         {
            Addingmeals += Prices[0];
         }
         if(source == meal6)
         {
            Addingmeals += Prices[3];
         }
         if(source == meal7)
         {
            Addingmeals += Prices[4];
         }
         if(source == meal8)
         {
            Addingmeals += Prices[5];
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
           // throw new Mealexception("Exception: Invalid VIN");
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
             LocalTime LTime = LocalTime.now();
             int Lh = LTime.getHour();
             SavingHour = EnteringHour.getText();
             String Hour = EnteringHour.getText();
             int hour = Integer.parseInt(Hour);
             if(hour < 6 || hour > 13)
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
