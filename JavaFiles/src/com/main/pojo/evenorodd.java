import java.util.*;

class evenorodd{
public static void main(String[] args){
  Scanner s = new Scanner(System.in);
  double choice = 1;
  while(choice == 1){

    double a;

    System.out.println("Enter a number to check odd or even");
    a = s.nextDouble();

    if(a%2==0){
      System.out.println("Your number is even");
    }

    else{
      System.out.println("Your number is odd");
    }

    System.out.println("Want to check more 1 for yes 0 for no");

    choice = s.nextDouble();

  }

  System.out.println("I hope you checked all your numbers.");

}
}
