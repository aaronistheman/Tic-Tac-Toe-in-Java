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

  String  mName;
  char    mMark;
  
  // *********************  Constructors  *********************
  
  public Square(String name, char mark)
  {
    mName = name;
    mMark = mark;
  }
  
  // ********************  Public methods  ********************
  
  public String getName()
  {
    return mName;
  }
  
  public void setName(String name)
  {
    mName = name;
  }
  
  public char getMark()
  {
    return mMark;
  }
  
  public void setMark(char mark)
  {
    mMark = mark;
  }
  
}