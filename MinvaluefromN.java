import java.util.Scanner;
 
class MinvaluefromN {
 
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
 
    System.out.println("How many values do you want to enter");
    int n = s.nextInt(); // 5 10
    int min = 0;
    System.out.println("Enter " + n + " values"); // 45,89,55,90,33
    min = s.nextInt();
    for (int i = 1; i < n; i++) {
      int num = s.nextInt();
      if (min > num) {    // 45>33
        min = num;
      }
    }
    System.out.println("Min value: " + min);
  }
 
}