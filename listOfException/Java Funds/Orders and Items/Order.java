import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Order {
    //propatries/ instance varibles/ Attributes /member variables :
    public String name;
    public double total;
    public boolean ready;
    public ArrayList<Item> items = new ArrayList<Item>();
    public static int counterorders=0;
    public Order(String nm){ // order constructor
        this.name=nm;
        counterorders++;
    }
    

    

}
