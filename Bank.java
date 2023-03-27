import java.util.Scanner;
 
public class Bank {
    Scanner s=new Scanner(System.in);
    double acbal=30000;
    
    
    public void deposite() {
        System.out.println("Enter deposite amount");
        int amount=s.nextInt();
        if(amount <=50000){
          if(amount%100==0){
          acbal=acbal+amount;
            }
          else{
           System.out.println("Enter multiples of 100 only"); 
          }
          
      }
      else{
        System.out.println("ammount should be less than 50000");
      }
      System.out.println("Available balnace : "+acbal);
      viewOptions();
    }
    public void withdraw(){
    System.out.println("Enter withdraw amount");
      int amount=s.nextInt();
      
      if(amount%100 == 0){
        if(amount<=(acbal-500)){
          if(amount<=20000){
            System.out.println("Withdraw amount is "+amount);
            acbal=acbal-amount;
                        int twok=amount/2000;
                        amount=amount%2000;
                        int five=amount/500;
                        amount=amount%500;
                        int twohundred=amount/200;
                        amount=amount%200;
                        int hundred=amount%100;
                        System.out.println("Two thousand Notes :"+twok);
                        System.out.println("Five Hundred Notes :"+five);
		                    System.out.println("Two Hundred Notes:"+twohundred);
		                    System.out.println("Hundred Notes :"+hundred);
            System.out.println("available bal : "+acbal);
          }
          else{
            System.out.println("Please enter amount less than 20000");
          }
          
          }
        else{
          System.out.println("less funds");
        }
      
      
      }else{
        System.out.println("Enter multiples of 100's");
      }
      viewOptions();
    }
    public void bal(){
    System.out.println("available bal : "+acbal);
      viewOptions();
    }
    public void viewOptions() {
        System.out.println("======Welcome to ABC Bank========");
        System.out.println("1. Deposite");
        System.out.println("2. Withdraw");
        System.out.println("3. Bal Enquiry");
        System.out.println("0. EXIT");
        System.out.println("Choose your option");
        int option=s.nextInt();
        switch(option) {
        case 1:{
            deposite();
            break;
        }
        case 2:{
            withdraw();
          break;
        }
       case 3:{
            bal();
         break;
       }
       case 0:{
            System.out.println("Thank you visit again");
         break;
        }
       default:
       {
           System.out.println("Invalid option");
       }
 
        }
        
    }
    public void validate() {
        
        System.out.println("Enter pin");
        
      int c=0;
       while(c<3)
       {
         int pin=s.nextInt();
         if(pin==1234) {
            viewOptions();
        }
        else {
            System.out.println("Invalid pin number, please try again");
        }
      c=c+1;
         
    }
  System.out.println("Your card blocked for the day");
    }
    public static void main(String[] args) {
        Bank obj=new Bank();
      obj.validate();
      
          
    }
 
}