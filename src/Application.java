/**
 * @(#)Application.java
 *
 * TicTacToe application
 *
 * @author Aaron Singh
 * @version 1.00 2014/12/30
 */
 
public class Application 
{
  // ******************  Instance variables  ******************
  
  
  
  // *********************  Constructors  *********************
  
  public Application()
  {
    System.out.println("Application::Application()");
  }
  
  // ********************  Public methods  ********************
  
  public void run()
  {
    System.out.println("Application::run()");
    
    displayBoard();
  }
  
  // ********************  Private methods ********************
  
  private void displayBoard()
  {
    System.out.println("  |  |  ");
    System.out.println("__|__|__");
    System.out.println("  |  |  ");
    System.out.println("__|__|__");
    System.out.println("  |  |  ");
    System.out.println("  |  |  ");
  }
  
}
