/**
 * @(#)Application.java
 *
 * TicTacToe application
 *
 * @author Aaron Singh
 * @version 1.00 2014/12/30
 */
 
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

 
public class Application 
{
  // *******************  Static constants  *******************
  
  private static final char markX = 'x';
  private static final char markO = 'o';
  private static final char markBlank = ' ';
  
  // game board row coordinates
  private static final int rowA = 0;
  private static final int rowB = 1;
  private static final int rowC = 2;
  
  // game board column coordinates
  private static final int column1 = 0;
  private static final int column2 = 1;
  private static final int column3 = 2;
  
  // ******************  Instance variables  ******************
  
  private char mCurrentTurn;
  private Scanner mScanner; // for input
  
  private Square[][] mBoard;
  private Map<String, Coordinates> mCoordinates;
  
  // *********************  Constructors  *********************
  
  public Application()
  {
    mCurrentTurn = markX;
    mScanner = new Scanner(System.in);
    
    // Initialize the game board's matrix
    mBoard = new Square[3][3];
    for (int r = 0; r < mBoard.length; r++)
      for (int c = 0; c < mBoard[r].length; c++)
      {
        mBoard[r][c] = new Square(markBlank);
      }
      
    // Initialize the map of square names mapped to coordinates
    mCoordinates = new HashMap<String, Coordinates>();
    mCoordinates.put("a1", new Coordinates(rowA, column1));
    mCoordinates.put("a2", new Coordinates(rowA, column2));
    mCoordinates.put("a3", new Coordinates(rowA, column3));
    mCoordinates.put("b1", new Coordinates(rowB, column1));
    mCoordinates.put("b2", new Coordinates(rowB, column2));
    mCoordinates.put("b3", new Coordinates(rowB, column3));
    mCoordinates.put("c1", new Coordinates(rowC, column1));
    mCoordinates.put("c2", new Coordinates(rowC, column2));
    mCoordinates.put("c3", new Coordinates(rowC, column3));
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
    String row1 = "   " + mBoard[rowA][column1].getMark() + "| " + 
      mBoard[rowA][column2].getMark() + "| " + 
      mBoard[rowA][column3].getMark();
    String row2 = "   " + mBoard[rowB][column1].getMark() + "| " + 
      mBoard[rowB][column2].getMark() + "| " + 
      mBoard[rowB][column3].getMark();
    String row3 = "   " + mBoard[rowC][column1].getMark() + "| " + 
      mBoard[rowC][column2].getMark() + "| " + 
      mBoard[rowC][column3].getMark();
    
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
    
    // Eliminate case sensitivity
    input = input.toLowerCase(Locale.ENGLISH);
    
    return input;
  }
  
  private boolean badInput(String square)
  {
    return false;
  }
  
  // Uses parameter name to find the correct square in the matrix
  private Square getCorrespondingSquare(String name)
  {
    Coordinates coordinates = mCoordinates.get(name);
    
    if (coordinates == null)
      throw new IllegalArgumentException(
        "The following square does not exist: " + name);
    
    return mBoard[coordinates.getRow()][coordinates.getColumn()];
  }
  
  // Changes the approriate square's mark to match the active player's mark
  private void updateBoard(String square)
  {
    getCorrespondingSquare(square).setMark(mCurrentTurn);
  }
  
  private void switchTurn()
  {
    if (mCurrentTurn == markX)
      mCurrentTurn = markO;
    else if (mCurrentTurn == markO)
      mCurrentTurn = markX;
    else
      throw new AssertionError(
        "mCurrentTurn should be 'x' or 'o', but is: " + mCurrentTurn);
  }
  
}
