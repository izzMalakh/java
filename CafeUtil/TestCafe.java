import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class TestCafe {
    public static void main(String[] args) {
        
   
        CafeUtil appTest = new CafeUtil();
        appTest.getStreakGoal(9);
    
        
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        appTest.getOrderTotal(lineItems);
        

        List<String> loadMenu = Arrays.asList(
            "drip coffee",
            "cappucino",
            "latte",
            "mocha"
        );
        ArrayList<String> menu = new ArrayList<String>();
        menu.addAll(loadMenu);
        appTest.displayMenu(menu);
        //Sensi bonus:
        
        
        ArrayList<String> customers = new ArrayList<String>();

        for (int i = 0; i < 4; i++) {
        
        appTest.addCustomer(customers);
        System.out.println("\n");
        
        }
        
        appTest.viewDetails("Columbian Coffee Grounds", 15, 3);
        
        appTest.displayMenu(menu, lineItems);

  
        
     
      
    
    }
}