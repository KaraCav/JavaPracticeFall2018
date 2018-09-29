// 1. Break/ Continue
public class BreakContinue {
  public static void main(String[] args){
    int[] numbers= {1,3,5,6,7,9,10};
    for (int i = 0; i < numbers.length; i++){
      if (numbers[i] % 2 == 0) {
       continue; 
      }
      else if(numbers[i] > 9){
       break; 
      }
      System.out.println(numbers[i]);
    }
          System.out.println("done");
  }  
}
