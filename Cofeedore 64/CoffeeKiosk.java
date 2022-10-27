import java.util.ArrayList;
public class CoffeeKiosk{
    private ArrayList<Item> menu = new ArrayList<Item>();
    private ArrayList<Order> orders = new ArrayList<Order>();

    public CoffeeKiosk() {

    }
    public void addMenuItem(String name, double price) {
        Item newItem = new Item(name, price); //constrctor of item class
        menu.add(newItem);
        int index = menu.indexOf(newItem);
        newItem.setIndex(index);
    }
    public void displayMenu(){
        
        for (Item i : this.menu) {
      System.out.println(
        i.getIndex() + " " + i.getName() + " -- $" + i.getPrice()
      );
    }
  
    }
        public void newOrder() {
        
    	// Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
    
    	Order newOrder = new Order(name);
        displayMenu();
    	// Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        
        
    while (!itemNumber.equals("q")) {
      // Get the item object from the menu, and add the item to the order
      int i = Integer.parseInt(itemNumber);
      if (i < this.menu.size()) {
        Item orderItem = menu.get(i);
        newOrder.addItems(orderItem);
      } else {
        System.out.println("Sorry we do not have it");
      }
      // Ask them to enter a new item index or q again, and take their input
      System.out.println(
        "Please enter the index of the coffee you would like to order, or press q to exit"
      );
      itemNumber = System.console().readLine();
    }
    // After you have collected their order, print the order details
    // as the example below. You may use the order's display method.
    newOrder.display();
    this.orders.add(newOrder);
  }


}