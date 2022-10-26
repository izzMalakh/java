import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class TestCafe {
    public static void main(String[] args) {
        Item item1 = new Item("mocha",5);
        Item item2 = new Item("latte",7);
        Item item3 = new Item("drip coffee",3);
        Item item4 = new Item("capuccino",10);

        Order order1 = new Order("Cindhuri");
        Order order2 = new Order("Jimmy");
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");

        System.out.println(order1);
        System.out.println(order1.total);

        // ArrayList<String> menu = new ArrayList<String>();
        // List<String> loadMenu = Arrays.asList(
        //     item1.name,
        //     item2.name,
        //     item3.name,
        //     item4.name
        // );
        // menu.addAll(loadMenu);
        // System.out.println(loadMenu);
        
        
        order2.items.add(item2);
        order3.items.add(item4);
        order4.items.add(item2);
        order4.items.add(item2);
        order4.items.add(item2);
        order1.ready=true; //order 1 is ready for Cindhuri
        order2.ready=true; //order 2 is ready for Jimmy
            for(int i=0;i<order2.items.size();i++){
                System.out.println(order2.items.get(i).name);
            }
            
        System.out.println(Order.counterorders);
        ArrayList<Item> items = new ArrayList<Item>();  
    }
}