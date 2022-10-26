import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Order {
    //propatries/ instance varibles/ Attributes /member variables :
    private String name;
    private double total;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();

    public static int counterorders=0;

    public Order(){ // order constructor
        this.name="Quest";
        counterorders++;
    }
    public Order(String nm){ // order constructor
        this.name=nm;
        counterorders++;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name=newName;
    
    }

    public double getTotal(){
        return this.total;
    }
    public void setTotal(double newTotal){
        this.total=newTotal;
    }

    public boolean getReady(){
        return this.ready;
    }
    public void setReady(boolean status){
        this.ready=status;
    }
    public ArrayList<Item> getItems(){
        return this.items;
    }
    public void setItems(ArrayList<Item> newItem){
        this.items=newItem;
    }
    public void addItems(Item itemm){
        this.items.add(itemm);
    }
    public String getStatusMessage(){
        // System.out.println(this.ready);
        if(this.ready==true){
            return "Your order is ready";
        }
        else{
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }
    public void display(){
        System.out.print("Customer Name:");
        System.out.println(this.name);
        System.out.println("Orders:");
        for(int i=0;i<this.items.size();i++){
            
            System.out.print(items.get(i).getName()+" : ");
            System.out.println(items.get(i).getPrice());
        }
        System.out.print("Total: ");
        double tempp=0;
        for(int i=0;i<this.items.size();i++){

            tempp = tempp + items.get(i).getPrice();
            
        }
        System.out.print(tempp);
        System.out.println(" NIS");
    
    }
    public void getOrderTotal(){

        System.out.print("Total order is :");
        double temp=0;
        for(int i=0;i<this.items.size();i++){
            temp = temp+ items.get(i).getPrice();
            
        }
System.out.println(temp);
    }
    

}
