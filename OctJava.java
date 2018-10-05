1. Switch Cases
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
