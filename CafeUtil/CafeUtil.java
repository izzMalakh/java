import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class CafeUtil {
    
    public void getStreakGoal(int numWeeks) {
        int purchases = 0;
        
        for(int i = 0; i<=numWeeks; i++){
            purchases = purchases + i;
        }
        
    System.out.println("----- Strak Goal Test -----");
    System.out.println("Parchases needed by week "+ numWeeks + " is: " + purchases +"\n");
    
    
    }
    public void getOrderTotal(double[] prices){
        System.out.println("----- Order Total Test -----");
        double temp=0;
        for(int i = 0; i<prices.length ;i++){
            temp = temp + prices[i];
        }
        System.out.println("order total is: " +temp);
        System.out.print("\n");
        
    }
    public void displayMenu(ArrayList<String> menuItems){
        System.out.println("----- Display Menu Test -----");
        int temp = -1;
        for(int i = 0; i<menuItems.size() ; i++){
            temp++;
            System.out.println(temp + " " + menuItems.get(i));
            
        }
        System.out.print("\n");

    }
      int temprory =-1;  
    //sensi bonus:
    public void addCustomer(ArrayList<String> customers){
        temprory++;
        System.out.println("----- Add Customer Test-----");
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        
        customers.add(userName); 
        System.out.println("Hello," + userName);
        System.out.println("There are " + temprory + " people in front of you") ;
        System.out.print(customers);
        
        }
        
        


    
    //Senpai Bonus: 
    public void viewDetails(String product, float price, int maxQuantity){
        
        System.out.println(product);
        double tempo=0;
        for(int i = 1; i<maxQuantity+1 ;i++){
            tempo =  tempo + 0.5;
            System.out.print(i +" - ");
            System.out.println("$" + ((price*i) - tempo));
            
            
            
        }
    }
    
    public boolean displayMenu(ArrayList<String> menu, double[] prices){

        if (menu.size() != 4){
            return false;
        }
        else{
            int sensi=-1;
            System.out.print("\n");
            for (int i=0;i<menu.size();i++){
                sensi++;
            System.out.println(sensi + " " + menu.get(i) + " -- $" + prices[i]);
            
            }
        }
        return true;
    }
}
