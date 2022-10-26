import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Puzzling {
    
    public static int[] getTenRolls() {
        Random rand = new Random();
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++){
            arr[i] = rand.nextInt(45)+55;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    public static String getRandomLetter(){
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Random rand = new Random();
        String str = "";
        int random;
        
            random = rand.nextInt(26);
            str += alphabet[random];
        
        System.out.println(str);
        return str;
    }
        public static String generatePassword(){
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Random rand = new Random();
        String str = "";
        int random;
        for(int i = 0; i<= 7; i++){
            random = rand.nextInt(26);
            str += alphabet[random];
        }
        System.out.println(str);
        return str;
    }
     public void getNewPasswordSet(int passwords, int sizee){
        String AlphaNumericStr = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz";
        StringBuilder s = new StringBuilder();
        
        for(int j=0;j<passwords;j++){
        for(int i=0;i<sizee;i+=1){
            int ch = (int)(AlphaNumericStr.length() * Math.random());
            s.append(AlphaNumericStr.charAt(ch));
            
        }
        s.append(" , ");
        }
        s.deleteCharAt(s.length()-2);
        System.out.println(s);

        

    }
    }


    
