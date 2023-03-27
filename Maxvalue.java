import java.util.Scanner;
class Maxvalue {
 
  public static void main(String args[]) {
 
    Scanner s=new Scanner(System.in);
 
    int a=0,b=0,c=0,d=0,e=0;
 
    System.out.println("Enter Numbers");
    a=s.nextInt();
    b=s.nextInt();
    c=s.nextInt();
    d=s.nextInt();
    e=s.nextInt();
    if(a>b&&a>c&&a>c&&a>d&&a>e){
    System.out.println("Biggest number is "+a);  
    }
    else if(b>c&&b>d&&b>c){
      System.out.println("Biggest number is "+b);
    }
   else if(c>d&&c>e){
     System.out.println("Biggest number is "+c);
   }
    else if(d>e){
      System.out.println("Biggest number is "+d);
    }
    else{
      System.out.println("Biggest number is "+e);
    }
  
  }
 
}