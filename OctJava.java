// 1. Switch Cases

public class SwitchCase{
  public static void main(String[] args){
   String myStr = "My First String!"; 
   System.out.println("Start");
   int index = 0;
   while(index < myStr.length()) {
     switch(myStr.charAt(index)){
       case 'i' : System.out.println("This is an i");
       default: System.out.println("index " + index + " is not an i");
     }
     index++;
  }
      System.out.println("END");
}
}

// 2. Check if Palindrome

import javax.swing.JOptionPane; //need to importJOptionPane
         // JOptionPane allows you to generate a plain textbox in UI for user input
public class Palindromes{
  
  public static void main(String[] args){
    
   long num, temp; // can create two vars or same type this way, without assigning any values
    String inputStr, outputStr;
    inputStr = JOptionPane.showInputDialog("Enter an integer, positive or negative");
    num = Long.parseLong(inputStr);
    System.out.println(num);
    temp = num;
    
    if(num <= 0){ // need to convert negative nums to positive, since -8 !== 8 in value
      num = -num;
      inputStr = inputStr.valueOf(num);
    }
    
    if(isAPalindrome(inputStr)){
     outputStr = temp + " is a palindrome"; 
    }
    else{
    outputStr = temp + " is not a palindrome";
    }
    JOptionPane.showMessageDialog(null, outputStr, "Palindrome Program", JOptionPane.INFORMATION_MESSAGE);
  }   // in this case, showMessageDialog() takes in several params: 1. no specified parent component, 
      // 2. type of output, 3. header of box 4. message type, which changes the appearance of the modal
 
  public static boolean isAPalindrome(String inputStr) {
   int len = inputStr.length();
   int i, j;
   
   j = len - 1;
   for(i = 0; i <= (len-1)/2 ; i++){
             // loop forward through string assigning int i that value, while looping backward to get j's
     if(inputStr.charAt(i) != inputStr.charAt(j)){
             // if int i and int j aren't the same at any point, the number isn't a palindrome
      return false;
     }
      j--;
     }
     return true; // returns to if(isAPalendrome(true))
  }
}
// 3. Guess a Number Game

import java.util.*;

public class FirstNumberGame {
    public static void main(String[] args){
  
      Scanner userInput = new Scanner(System.in); //1. used to get input of the primitive types like int, double etc.
                          // pass the predefined object System.in, which represents the standard input stream
      int correctAnswer = (int)Math.ceil(Math.random() * 10);

      // int userGuess = -1;
      
      System.out.println("I am thinking of a number from 1 to 100.");
      System.out.println("You have three tries to guess my number, or enter -1 to exit.");
      
      for(int i = 0; i < 3; i++){
        System.out.println("Please guess a number");
        int userGuess = userInput.nextInt();
        if(userGuess > correctAnswer){
         System.out.println("Your number is too high!"); 
        }
        else if(userGuess < correctAnswer){
         System.out.println("Your number is too low!"); 
        }
        else{
         System.out.println("You got it! I owe you a drink!"); 
         break;
        }
      }
      
              //continue taking input from scanner in loop
//    while(userGuess > -1) {    // if input is -1 break loop
//
//    }
      
 }
     // if(userGuess != correctAnswer){
        System.out.println("Sorry, the mumber I was thinking of was " + correctAnswer);
      // }
}

// 4. Second type of number game- guess once within 3 of correct number

import java.util.*;

public class SecondNumberGame {
        
    Scanner userInput = new Scanner(System.in); 
    int correctAnswer;
    Integer userGuess;
    
    public static void main(String[] args) {
      
        System.out.println("I am thinking of a number from 1 to 100.");
        System.out.println("Guess my number or enter -1 to exit.");

        while(userGuess != -1) {  //continue taking input from scanner in loop
          randomNum();
          getInput();      
        }   
  
 }
   public static void getInput(){
          int userGuess = userInput.nextInt();
   }
        
   public static void randomNum(){
      correctAnswer = (int)Math.ceil(Math.random() * 100);
   }  
   
   public static Boolean checkGuess(){
     if(){
     
      }
   }
     // if(userGuess != correctAnswer){
       // System.out.println("Sorry, the mumber I was thinking of was " + correctAnswer);
      // }
}

// 5. CodeWars String Repeat: Write a function called repeatStr which repeats the given string string exactly n times.
  // repeatStr(6, "I") // "IIIIII"
public class Solution {
    public static String repeatStr(final int repeat, final String string) {
    String largeString = "";
    for(int i = 0; i < repeat; i++){
      largeString += string;
    }
        return largeString;
    }
}

// 6. Codewars Add All Positive Integers in an Array
public class Positive{
  public static int sum(int[] arr){
    int totalNum = 0;
    for(int i = 0 ; i < arr.length ; i++) {
      if(arr[i] > 0){
      totalNum += arr[i];
      }
    }
    return totalNum;
  }
}

// 7. CodeWars- Reversed Sequence: Get the number n (n > 0) to return the reversed sequence from n to 1. Ex.: n = 5 >> [5,4,3,2,1]
public class Sequence{

  public static int[] reverse(int n){
    
    int[] toReturn = new int[n];
    for(int i = 0; i < n; i++) {
      toReturn[i] = n - i;
    }
   return toReturn;
  }
}

// 8. Leetcode- Two Sum
public int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[j] == target - nums[i]) {
                return new int[] { i, j };
            }
        }
    }
    throw new IllegalArgumentException("No solution");
}

// 9. Codewars -> best way to convert integer to string
class Kata {
  public static String numberToString(int num) {
return String.valueOf(num);
  }
}
// String.valueOf() is better than string concatenation, which the compiler wil replace with StringBuffer or StringBuilder
// That involves an extra object which in a loop would cause a lot of temporary objects

// 10. Codewars -> Return the result of an array where each number is multiplied by 2
import java.util.*;
public class Maps {
  public static int[] map(int[] arr) {
      return Arrays.stream(arr).map(x -> x*2).toArray();
  }
}
// OR
public class Maps {

  public static int[] map(int[] inputArray) {
  
  for (int i = 0; i < inputArray.length; i++) {
      inputArray[i] = inputArray[i]*2;
    } 
  return inputArray;
  } 
}

// 11A. Code wars: Number of People on the Bus- You are provided with a list (or array) of integer arrays (or tuples). 
// Each array has two items- # of ppl getting into bus (first item) and # of ppl get off the bus (second item) at a stop.
// Return number of people who are still in the bus after the last bus station (after the last array). 
import java.util.ArrayList;
class Metro {
public static int countPassengers(ArrayList<int[]> stops) {
 int people = 0;
        for (int i = 0; i < stops.size(); i++) {
            people += stops.get(i)[0] - stops.get(i)[1];
        }
        return people;
  }
}
// 11B. Answer with int array instead of ArrayList
public class CWBusStop {
  
 // int[][] transfer = new int[5][2];  => how to declare new 2D array with 5 columns and 2 rows(items in each)
 // int[] index = new int[] { 2, 0 };  => to manually assign values of first column with values of 2 and 0
  
  static int[][] transfer = new int[][]{
    { 2, 0 }, 
    { 2, 1 }, 
    { 4, 6 }, 
    { 3, 1 }, 
    { 0, 1 }, 
  };
  
  public static void main(String[] args) {
     int total = 0;
       
       for(int i = 0; i < transfer.length; i++) {
         total = total + (transfer[i][0] - transfer[i][1]);
       
       } 
           System.out.println(total);
  }
  
}
