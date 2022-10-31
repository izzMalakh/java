import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Item{
//propatries/ instance varibles/ Attributes /member variables :
    private String name;
    private double price;
    private int index;
    private static int counter=0;

    public Item(String nm, double prc){ // item constructor
        this.name=nm;
        this.price=prc;
        counter++;
    }
    public String getName(){
        return this.name;
    }
    public void setIndex(int index) {
    this.index = index;
  }

  public int getIndex() {
    return this.index;
  }
    public void setName(String newName){
        this.name=newName;
    
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double newPrice){
        this.price=newPrice;
    
    }

}