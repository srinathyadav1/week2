import java.util.Scanner;
public class Resto{
  Scanner s=new Scanner(System.in);
 // double total=0;
 // double total1=0,total2=0;
  //double c1=0,c2=0,c3=0,c4=0,gst=0,total=0;
  
public void idli(){
 System.out.println("Enter quantity");
   int a=s.nextInt();
  int b=a*50;
  double gst=b*0.05;
   double total=a+b;
  System.out.println("Cost of idli "+50);
  System.out.println("Quantiy of idli "+a);
  System.out.println("GST "+gst);
  System.out.println("Total Bill "+total); 
  System.out.println(" ");
  viewoptions();
}
  public void dosa(){
 System.out.println("Enter quantity");
   int a=s.nextInt();
  int b=a*70;
  double gst=b*0.05;
   double total=a+b;
  System.out.println("Cost of dosa "+70);
  System.out.println("Quantiy of dosa "+a);
  System.out.println("GST "+gst);
  System.out.println("Total Bill "+total);  
    System.out.println(" ");
    viewoptions();
}
  public void vada(){
 System.out.println("Enter quantity");
   int a=s.nextInt();
  int b=a*60;
  double gst=b*0.05;
   double total=a+b;
  System.out.println("Cost of vada "+60);
  System.out.println("Quantiy of vada "+a);
  System.out.println("GST "+b);
  System.out.println("Total Bill "+total); 
    System.out.println(" ");
    viewoptions();
}
  public void puri(){
 System.out.println("Enter quantity");
   int a=s.nextInt();
  int b=a*50;
  double gst=b*0.05;
   double total=a+b;
  System.out.println("Cost of puri "+50);
  System.out.println("Quantiy of puri "+a);
  System.out.println("GST "+gst);
  System.out.println("Total Bill "+total);
    System.out.println(" ");
    viewoptions();
}
  public void viewoptions(){
    System.out.println("Welcome to Star Restaurent");
    System.out.println("1 . Idli - Rs.50");
    System.out.println("2 . Dosa - Rs.70");
    System.out.println("3 . Vada - Rs.60");
    System.out.println("4 . Puri - Rs.50");
    System.out.println("5 . Exit");
    System.out.println("Choose your option");
    int option=s.nextInt();
    
    switch(option){
      case 1:{
        idli();
        break;
      }
        case 2:{
        dosa();
          break;
      }
        case 3:{
        vada();
          break;
      }
        case 4:{
        puri();
          break;
      }
        case 5:{
        System.out.println("Thank you Visit again");
         // total=total1+total2;
         // System.out.println(total);
               }
    }
  }
  public static void main(String[]args){
    Resto obj=new Resto();
    obj.viewoptions();
  }
}