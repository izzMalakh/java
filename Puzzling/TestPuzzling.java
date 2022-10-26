import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class TestPuzzling{
    public static void main(String[] args){
        Puzzling appTest = new Puzzling();
        appTest.getTenRolls();
        appTest.getRandomLetter();
        appTest.generatePassword();
        appTest.getNewPasswordSet(6,8);
    
    }
}