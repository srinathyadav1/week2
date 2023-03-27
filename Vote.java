import java.util.Scanner;
class Vote {
 
  public static void main(String args[]) {
 
    Scanner s=new Scanner(System.in);
 
    int age=0;
 
    System.out.println("Enter age");
    age=s.nextInt();    
    if(age>=18){
       System.out.println("He/She is eligible for vote");
    }
   else{
      System.out.println("He/She is not eligible for vote");
   }
    
  }
 
}