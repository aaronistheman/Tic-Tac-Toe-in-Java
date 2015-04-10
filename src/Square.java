/**
 * @(#)Square.java
 *
 *
 * @author 
 * @version 1.00 2015/1/1
 */


public class Square 
{
  
  // ******************  Instance variables  ******************

  char mMark; // will be 'x', 'o', or ' '
  
  // *********************  Constructors  *********************
  
  public Square(char mark)
  {
    mMark = mark;
  }
  
  // ********************  Public methods  ********************
  
  public char getMark()
  {
    return mMark;
  }
  
  public void setMark(char mark)
  {
    mMark = mark;
  }
  
}