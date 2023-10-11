/* Import Statements */
import java.util.Scanner;

class FibonacciCalculator {
  public static void main(String[] args) {
      // Declare variables
      int n;

      // Declare a Scanner
      Scanner keyboard = new Scanner(System.in);
        
      System.out.print("Enter the number of terms for the Fibonacci sequence: ");
      n = keyboard.nextInt();
        
      System.out.print("Fibonacci sequence: ");
      calculateFibonacci(n);

      // Closes out keyboard
      keyboard.close();
  }

  /**
  The calculateFibonacci method calculates the Fibonacci sequence and prints it.
  @param n Represents the "nth" term, controls the sequence.
  */

  public static void calculateFibonacci(int n) {
      // Declare variables
      int num1 = 0; // First number in the sequence
      int num2 = 1; // Next numbers in the sequence, looped
      int num3;     // Last number in the sequence
    
      // Print the first number in the sequence, zero
      if (n >= 1) {
        System.out.print(num1);
      }

      // Calculate the actual Fibonacci sequence, using a
      // for loop to control it and ensure there is no comma at the end
      for (int i = 1; i < n; i++) {
        System.out.print(", " + num2);
        
        // The last number in the sequence equals the sum of
        // the first and second
        num3 = num1 + num2;
        num1 = num2;
        num2 = num3;
      }
  }
}