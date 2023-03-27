import java.util.Scanner;
 
class MaxvaluefromN {
 
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
 
    System.out.println("How many values do you want to enter");
    int n = s.nextInt(); // 5 10
     int max=0;
    System.out.println("Enter " + n + " values");    // 45,89,55,90,33
    for (int i = 1; i <= n; i++) {
      int num =  s.nextInt();
      if(max<num){       //90<33
          max=num;        //max=90
      }
    }
    System.out.println("Max value: "+max);
  }
 
}