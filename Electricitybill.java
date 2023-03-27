import java.util.Scanner;
class Electricitybill {
 
  public static void main(String args[]) {
 
    Scanner s=new Scanner(System.in);
 
    double units=0,gst=0,Totalbill=0,cost=0;
 
    System.out.println("Enter units");
    units=s.nextInt();  
    if(units<=50){
      cost=units*4.20;
   }
    else if(units<=150){
      cost=(units-50)*(5.67+4.20);
    }
    else if(units<=250){
      cost=(units-150)*8.90+(100*5.67)+(50*4.20);
    }
    else{
      cost=((units-250)*9.50)+(100*8.90)+(100*5.67)+(50*4.20);
    }
    gst=(cost*0.18);
      Totalbill=cost+gst;
      System.out.println("Your bill is "+Totalbill);
  }
 
}