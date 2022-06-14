import java.util.Scanner;
/**
* Program to read in an integer and check if it equals the
* target number
*/
public class Main
 {
  public static void main(String[] args) {
      final int CONSTANTNUMBER = 55;
      Scanner keyboard = new Scanner(System.in);
      int guessNumber;

      System.out.println("Enter your lucky number: ");
      guessNumber = keyboard.nextInt();

      if (guessNumber == CONSTANTNUMBER)
      {
         System.out.println("You get the number, Congratulations!");
      } else
      {
         System.out.println("Sorry, you have guessed incorrectly, try again!");
    }//else
  }//main
}//class