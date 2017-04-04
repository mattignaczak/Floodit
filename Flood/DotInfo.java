public class DotInfo extends java.lang.Object{

  int[][] dot;
  int dotColor;
  boolean captured;


  public DotInfo(int x, int y, int color){
    dot = new int[2][2];
    this.dot[0][0] = x;
    this.dot[0][1] = y;
    dotColor = color;
  }

  public int getColor(){
    return dotColor;
  }
  public int getX(){
    return dot[0][0];
  }
  public int getY(){
    return dot[0][1];
  }
  public boolean isCaptured(){
    return captured;
  }
  public void setCaptured(boolean captured){
    this.captured = captured;
  }
}
