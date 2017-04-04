import java.util.Random;

public class GameModel extends java.lang.Object{

  public static final int COLOR_0 = 0;
  public static final int COLOR_1 = 1;
  public static final int COLOR_2 = 2;
  public static final int COLOR_3 = 3;
  public static final int COLOR_4 = 4;
  public static final int COLOR_5 = 5;
  public static final int NUMBER_OF_COLORS = 6;

  public DotInfo[][] dots;
  int size;
  int currentColor;
  Random generator;
  int steps = 0;




  public GameModel(int size){
    //get the size of the board
    this.size = size;
    // create a dot grid
    dots = new DotInfo [size][size];
    // randomize the grid
    generator = new Random();
    //reset();

  }

  public void capture(int i, int j){
    int x = 0;
    int y = 0;
    while(y < size ){
      while(x < size){
        if (dots[y][x].getX() == i && dots[y][x].getY() == j){
          dots[y][x].setCaptured(true);
        } x++;
      } y++;
      }
    }

  public DotInfo get(int i, int j){
    DotInfo dot = null;
    int y = 0;
    int x = 0;
    while(y < size ){
      while(x < size){
        if (dots[y][x].getX() == i && dots[y][x].getY() == j){
          dot = dots[y][x];
        } x++;
      } y++;
      } return dot;
  }
  public int getColor(int i, int j){
    int color = 0;
    int x = 0;
    int y = 0;
    while(y < size ){
      while(x < size){
        if (dots[y][x].getX() == i && dots[y][x].getY() == j){
          color = dots[y][x].getColor();
        } x++;
      } y++;
      } return color;
  }

  public int getCurrentSelectedColor(){
    return currentColor;
  }
  public int getNumberOfSteps(){
    return steps;
  }
  public int getSize(){
    return size;
  }
  public boolean isCaptured(int i, int j){
    boolean capture = true;
    int x = 0;
    int y = 0;
    while(y < size ){
      while(x < size){
        if (dots[y][x].getX() == i && dots[y][x].getY() == j){
          capture = dots[y][x].isCaptured();
        } x++;
      } y++;
      } return capture;

  }
  public boolean isFinished(){
    boolean flag = true;
    int x = 0;
    int y = 0;
    while(y < size ){
      while(x < size){
        if (dots[y][x].isCaptured() == false){
          flag = false;
        } x++;
      } y++;
    } return flag;
  }

  public void reset(){
    generator = new Random();
    int color = 0;
    int i = 0;
    int j = 0;
    while (i < size){
      i++;
      dots[i][j] = new DotInfo(j, i, generator.nextInt(NUMBER_OF_COLORS)+1);
      if (i == size - 1){
        j++;
        i = 0;
        if (j == size - 1){
          break;
        }
      }
    }




    }
  public void setCurrentSelectedColor(int val){
    currentColor = val;
  }

  public void step(){
    steps++;
  }
  public java.lang.String toString(){
    String rep = " ";
    int k = 0;
    int x = 0;
    int y = 0;
    while(y < size ){
      while(x < size){
        rep += dots[y][x].getColor()+ " ";{
          dots[y][x].setCaptured(true);
        } x++;
      } y++;
    } k++;
      if (k == size){
        k = 0;
        rep += "\n";
      } return rep;
    }
  }
