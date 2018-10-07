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
         
public class Palindromes{
  
  public static void main(String[] args){
    
   long num, temp; 
    String inputStr, outputStr;
    inputStr = JOptionPane.showInputDialog("Enter an integer, positive or negative");
    num = Long.parseLong(inputStr);
    System.out.println(num);
    temp = num;
    
    if(num <= 0){ 
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
  }
  public static boolean isAPalindrome(String inputStr) {
   int len = inputStr.length();
   int i, j;
   
   j = len - 1;
   for(i = 0; i <= (len-1)/2 ; i++){
     if(inputStr.charAt(i) != inputStr.charAt(j)){
      return false;
     }
      j--;
     }
     return true;
  }
}
