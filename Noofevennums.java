import java.util.Scanner;
class Noofevennums {
 
  public static void main(String args[]) {
 
    Scanner s=new Scanner(System.in);
 
    int num=0,count=0;
 
    System.out.println("Enter Number");
    num=s.nextInt();    
   for(int i=1;i<=num;i++){
     if(i%2==0){
       count=count+1;
     }
   }
     System.out.println(count);
  }
 
}