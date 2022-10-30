import java.util.ArrayList;

public class listOfException{
    public static void main(String[] args){
        //make an ArrayList with both numbers and strings in it.
        ArrayList<Object> myList = new ArrayList<Object>();

        //add values
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        //You will loop through the list and try assigning each item to an int variable. To do this, you will also need to cast your list item as an Integer; you can do this like this:
        // for(int i = 0; i < myList.size(); i++){
        //     Integer var = (Integer) myList.get(i);
        // }

        // After you have set up this code, try running it. It should throw a ClassCastException. Change the program above to utilize exception handling to print out the error messages, the index of the ArrayList where the error occurred, and the value of the object that triggered the error. The program should continue after printing this to the console.

        //////////////////////////////////////////////////////
        for(int i = 0; i < myList.size(); i++)
            try{
                
                Integer var = (Integer) myList.get(i);
                System.out.println(var);
                }
            catch (Exception e) {
                // System.out.println(e);
                System.out.println("Index of the ArrayList where the error occurred: " + i);
                
            }

    }
}