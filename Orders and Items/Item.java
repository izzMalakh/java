import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Item{
//propatries/ instance varibles/ Attributes /member variables :
    public String name;
    public double price;
    public static int counter=0;
    public Item(String nm, double prc){ // item constructor
        this.name=nm;
        this.price=prc;
        counter++;
    }
}