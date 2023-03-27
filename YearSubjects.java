import java.util.Scanner;
class YearSubjects{
  public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    int Year=0;
    System.out.println("Enter  Year ");
    Year=s.nextInt();
    System.out.println("Enter  Department ");
    char dep=s.next().charAt(0);
    switch (Year){
      case 1 :
        switch (dep){
      case 'c' :
         System.out.println("Your Subjects : Maths , Physics , Chemistry , PPS");
      break;
      case 'm' :
         System.out.println("Your Subjects : Maths , Physics , Chemistry , Drawing");
      break;
      case 'e' :
         System.out.println("Your Subjects : Maths , Physics , Chemistry , BEE");
      break;
      default :
        System.out.println("Invalid input ");
        }
        break ;
      case 2 :
        switch(dep){
      case 'c' :
         System.out.println("Your Subjects : Wt , STM , Java , COSM");
      break;
      case 'm' :
         System.out.println("Your Subjects : EM , FM , HT , WP");
      break;
      case 'e' :
         System.out.println("Your Subjects : EM , EG , ES , PC");
      break;
      default :
        System.out.println("Invalid input ");
            
        }
        break;
        default :
        System.out.println("Invalid input ");
      
    }
    
  }
}