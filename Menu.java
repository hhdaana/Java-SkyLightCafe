//super class with attributes
public class Menu
{
   private String[] Meals;
   private double[] Prices;
   
   public Menu(String[] meals, double[] prices)
   {
      Meals = meals;
      Prices = prices;
   }
   
    public void setMeal(String[] meals)
   {
      Meals = meals;
   }
   public void setPrices(double[] prices)
   {
      Prices = prices;
   }
     
   public String[] getMeals()
   {
      return Meals;
   }
   public double[] getPrices()
   {
      return Prices;
   }
   
   
}

   
