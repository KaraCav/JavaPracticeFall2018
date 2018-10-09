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
