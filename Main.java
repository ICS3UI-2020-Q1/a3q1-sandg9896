import java.util.Scanner;
/**
 * Determine the greatest number
 * @author Gavin
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create scanner for user input
    Scanner input = new Scanner(System.in);

   // ask user to enter three numbers
    System.out.print("Please enter a number:");
    int number1 = input.nextInt();

    System.out.print("Please enter another number:");
    int number2 = input.nextInt();
    
    System.out.print("Please enter a final number:");
    int number3 = input.nextInt();

    // Determine the greatest number
    if(number1>number2 && number1>number3){
    System.out.print("Maximum: " + number1);
    }
    if(number2>number1 && number2>number3){
    System.out.print("Maximum: " + number2);
    }
    if(number3>number2 && number3>number1){
    System.out.print("Maximum: " + number3);
    }

    
  }
}
