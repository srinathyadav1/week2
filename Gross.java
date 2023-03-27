import java.util.Scanner;
class Gross{
  public static void main(String args[]) {
    
    Scanner s=new Scanner(System.in);
    
    double basic=0,hra=0,da=0,gross=0;
    System.out.println("Enter the basic salary");
    basic=s.nextInt();
    if(basic<=10000){
      hra=(basic*0.67);
      da=(basic*0.78);
    }
        else if(basic<=20000){
          hra=(basic*0.69);
          da=(basic*0.79);
        }
            else {
              hra=(basic*0.75);
              da=(basic*85);
            }
 gross=(basic+hra+da);
    System.out.println("your gross salary is "+gross);
    }
  }
