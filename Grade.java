import java.util.Scanner;
class Grade {
 
  public static void main(String args[]) {
 
    Scanner s=new Scanner(System.in);
 
    double project=0,internal=0,external=0,total=0,a=0,b=0,c=0;
 
    System.out.println("Enter Project score,internal score,external score");
    project=s.nextInt();
    internal=s.nextInt();
    external=s.nextInt();
    if(project>=50 && internal>=50 && external>=50){
      a=(0.7*project);
      b=(0.2*external);
      c=(0.1*internal);
      total=a+b+c;
        if(total>=90){
        System.out.println("A grade");
        }
        else if(total>=70){
        System.out.println("B grade");
        }
        else  {
          System.out.println("C grade");
        }
    }
    else{
      if(project<50){
        System.out.println("you failed in project and score is "+project);
      }
      if(external<50){
        System.out.println("you failed in external and score is "+external);
      }
      if(internal<50){
        System.out.println("you failed in internal and score is "+internal);
      }
    }
    
  }
 
}