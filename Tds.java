import java.util.Scanner;
public class SalaryTds
  {
    public static void main(String args[])
    {
      double tds=0;
      Scanner s=new Scanner(System.in);
      System.out.println("Enter your salary");
      double salary =s.nextInt();
      if(salary<=700000)
      {
        System.out.println("No TDS");
      }
      else if(salary<=1000000)
      {
        tds=(0.05*(salary-700000));
      }
      else if(salary<=1300000)
      {
        tds=(0.1*(salary-1000000))+(0.05*300000);
      }
       else if(salary<=1600000)
      {
        tds=(0.15*(salary-1300000)+(0.1*300000))+(0.05*300000);
      }
      else if(salary<=1900000)
      {
        tds=(0.2*(salary-1600000)+0.15*(300000)+(0.1*300000))+(0.05*300000);
      }
       else
      {
        tds=(0.3*(salary-1900000))+0.2*(300000)+0.15*(300000)+(0.1*300000)+(0.05*300000);
      }
      salary=salary-tds;
      System.out.println("Salary is"+salary);
      System.out.println("TDS Amount is"+tds);
     
    }
  }