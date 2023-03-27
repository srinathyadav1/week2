import java.util.Scanner;
class Evenodd {
 
  public static void main(String args[]) {
 
    Scanner s=new Scanner(System.in);
 
    int num=0;
 
    System.out.println("Enter Number");
    num=s.nextInt();    
    if(num%2==0){
       System.out.println("Given number is even number");
    }
   else{
      System.out.println("Given number is odd number");
   }
    
  }
 
}