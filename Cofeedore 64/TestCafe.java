import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class TestCafe {
    public static void main(String[] args) {
        Item item1 = new Item("mocha",5);
        Item item2 = new Item("latte",7);
        Item item3 = new Item("drip coffee",3);
        Item item4 = new Item("capuccino",10);

        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("ahmad");
        Order order4 = new Order("Sam");
        Order order5 = new Order("Izzaldeen");

        order3.addItems(item1);
        order2.addItems(item2);
        order2.addItems(item3);
        order2.addItems(item4);
        
        order2.display();
        order2.getOrderTotal();
        order3.setReady(false);
        System.out.println(order3.getStatusMessage());
        
        
        CoffeeKiosk coffeeKiosk = new CoffeeKiosk();
    
        // Menu items
        coffeeKiosk.addMenuItem("cappucino", 5.5);
        coffeeKiosk.addMenuItem("Mocha", 6.5);
        coffeeKiosk.addMenuItem("Latte", 4.5);
        coffeeKiosk.addMenuItem("Drip Coffee", 5.0);
    
       // Order
       

    //   coffeeKiosk.addMenuItemByInput();
       coffeeKiosk.newOrder();
        

        

        

      
        
        
        // order2.items.add(item2);
        // order3.items.add(item4);
        // order4.items.add(item2);
        // order4.items.add(item2);
        // order4.items.add(item2);
        
            // for(int i=0;i<order2.items.size();i++){
            //     System.out.println(order2.items.get(i).name);
            // }
            
  

    }

}