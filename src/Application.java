/**
 * @(#)Application.java
 *
 * TicTacToe application
 *
 * @author Aaron Singh
 * @version 1.00 2014/12/30
 */
 
import java.util.Scanner;

 
public class Application 
{
  // *******************  Static constants  *******************
  
  static final char x = 'x';
  static final char o = 'o';
  static final char blank = ' ';
  
  // ******************  Instance variables  ******************
  
  char mCurrentTurn, a1, a2, a3, b1, b2, b3, c1, c2, c3;
  Scanner mScanner;
  
  // *********************  Constructors  *********************
  
  public Application()
  {
    mCurrentTurn = x;
    a1 = blank;
    a2 = blank;
    a3 = blank;
    b1 = blank;
    b2 = blank;
    b3 = blank;
    c1 = blank;
    c2 = blank;
    c3 = blank;
    
    mScanner = new Scanner(System.in);
  }
  
  // ********************  Public methods  ********************
  
  public void run()
  {
    // while (true)
      doTurn();
  }
  
  // ********************  Private methods ********************
  
  private void displayBoard()
  {
    System.out.println("   " + a1 + "| " + a2 + "| " + a3);
    System.out.println("a __|__|__");
    System.out.println("   " + b1 + "| " + b2 + "| " + b3);
    System.out.println("b __|__|__");
    System.out.println("   " + c1 + "| " + c2 + "| " + c3);
    System.out.println("c   |  |  ");
    System.out.println("  1  2  3 ");
  }
  
  private void doTurn()
  {
    displayBoard();
    getInput();
  }
  
  private void getInput()
  {
    System.out.println("Current turn: " + mCurrentTurn);
    System.out.println("Enter the address of the square in which you");
    System.out.println("would like your shape (ex: b2).");
    
    String input = mScanner.nextLine();
    
    System.out.println(input);
  }
  
}
