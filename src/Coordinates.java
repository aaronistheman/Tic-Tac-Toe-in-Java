/**
 * @(#)Coordinates.java
 *
 *
 * @author 
 * @version 1.00 2015/4/9
 */


public class Coordinates {
  
  // ******************  Instance variables  ******************
  private int mRow;
  private int mColumn;
  
  // *********************  Constructors  *********************

  public Coordinates(int row, int column) 
  {
    mRow = row;
    mColumn = column;
  }
  
  // ********************  Public methods  ********************
  
  public int getRow()
  {
    return mRow;
  }
  
  public int getColumn()
  {
    return mColumn;
  }
}