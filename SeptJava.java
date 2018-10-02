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

// 2. Chaining Functions
public class Absolute {
  public static void main(String[] args) {
    int numberOne = -10;
    System.out.println(numberOne);
    int numberTwo = 5;
    int returnAbs = abs(numberTwo);
    System.out.println(returnAbs);
    abs(numberOne);
  }
  public static int abs(int arg1) {
    if (arg1 < 0) {
      arg1 = -arg1;
    }
      return arg1;
  }
  public static int add(int arg1, int arg2){
        System.out.println(arg1 + arg2);
   return arg1 + arg2; 
  }
  public static int larger(int arg1, int arg2){
    if (arg1 > arg2){
     return arg1; 
    }
    else{
    return arg2;
    }
  }
  public static int compareThree(int arg1, int arg2, int arg3){
   return larger(arg1, larger(arg2, arg3)); 
  }
}

// 3. While loops
public class WhileLoops {
  public static void main(String[] args) {
  int limit = 20;
  int counter = 0;
  System.out.println("start");
  while(counter < limit){
    if(counter % 2 == 0){
      System.out.println("even");
    } else {
      System.out.println("odd");
    }
    counter++;
  }
  boolean flag = true;
  while(flag){
    System.out.println(counter);
    if(counter == 2){
      flag = !flag;
    } 
    counter--;
  }
    System.out.println("end");
  }
}
