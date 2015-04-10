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
  
  char mCurrentTurn;
  Scanner mScanner; // for input
  
  Square a1, a2, a3, b1, b2, b3, c1, c2, c3;
  
  // *********************  Constructors  *********************
  
  public Application()
  {
    mCurrentTurn = x;
    mScanner = new Scanner(System.in);
    
    a1 = new Square("a1", blank);
    a2 = new Square("a2", blank);
    a3 = new Square("a3", blank);
    b1 = new Square("b1", blank);
    b2 = new Square("b2", blank);
    b3 = new Square("b3", blank);
    c1 = new Square("c1", blank);
    c2 = new Square("c2", blank);
    c3 = new Square("c3", blank);
  }
  
  // ********************  Public methods  ********************
  
  public void run()
  {
    doTurn();
    doTurn();
    doTurn();
  }
  
  // ********************  Private methods ********************
  
  private void displayBoard()
  {
    String row1 = "   " + a1.getMark() + "| " + a2.getMark() + 
      "| " + a3.getMark();
    String row2 = "   " + b1.getMark() + "| " + b2.getMark() + 
      "| " + b3.getMark();
    String row3 = "   " + c1.getMark() + "| " + c2.getMark() + 
      "| " + c3.getMark();
    
    System.out.println(row1);
    System.out.println("a __|__|__");
    System.out.println(row2);
    System.out.println("b __|__|__");
    System.out.println(row3);
    System.out.println("c   |  |  ");
    System.out.println("  1  2  3 ");
  }
  
  private void doTurn()
  {
    displayBoard();
    updateBoard(getInput());
    switchTurn();
  }
  
  private String getInput()
  {
    // Show prompt
    System.out.println("Current turn: " + mCurrentTurn);
    System.out.println("Enter the address of the square in which you");
    System.out.println("would like your shape (ex: b2).");
    
    // Asks for input until given valid input
    String input = mScanner.nextLine();
    if (badInput(input))
      input = mScanner.nextLine();
    
    return input;
  }
  
  private boolean badInput(String square)
  {
    return false;
  }
  
  // Uses the parameter to find the appropriate square
  private Square getCorrespondingSquare(String name)
  {
    if (a1.getName().equals(name))
      return a1;
    else if (a2.getName().equals(name))
      return a2;
    else if (a3.getName().equals(name))
      return a3;
    else if (b1.getName().equals(name))
      return b1;
    else if (b2.getName().equals(name))
      return b2;
    else if (b3.getName().equals(name))
      return b3;
    else if (c1.getName().equals(name))
      return c1;
    else if (c2.getName().equals(name))
      return c2;
    else if (c3.getName().equals(name))
      return c3;
    else
      throw new AssertionError(
        "getCorrespondingSquare() called with invalid argument: " + name);
  }
  
  // Changes the approriate square's mark to match the active player's mark
  private void updateBoard(String square)
  {
    getCorrespondingSquare(square).setMark(mCurrentTurn);
  }
  
  private void switchTurn()
  {
    if (mCurrentTurn == x)
      mCurrentTurn = o;
    else if (mCurrentTurn == o)
      mCurrentTurn = x;
    else
      throw new AssertionError(
        "mCurrentTurn should be 'x' or 'o', but is: " + mCurrentTurn);
  }
  
}
