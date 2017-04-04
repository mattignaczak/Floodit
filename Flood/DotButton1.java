import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
/**
 * In the application <b>FloodIt</b>, a <b>DotButton</b> is a specialized color of
 * <b>JButton</b> that represents a dot in the game. It can have one of six colors
 *
 * The icon images are stored in a subdirectory ``data''. We have 3 sizes, ``normal'',
 * ``medium'' and ``small'', respectively in directory ``N'', ``M'' and ``S''.
 *
 * The images are
 * ball-0.png => grey icon
 * ball-1.png => orange icon
 * ball-2.png => blue icon
 * ball-3.png => green icon
 * ball-4.png => purple icon
 * ball-5.png => red icon
 *
 *  <a href=
 * "http://developer.apple.com/library/safari/#samplecode/Puzzler/Introduction/Intro.html%23//apple_ref/doc/uid/DTS10004409"
 * >Based on Puzzler by Apple</a>.
 * @author Guy-Vincent Jourdan, University of Ottawa
 */

public class DotButton extends JButton {

  int dotX;
  int dotY;
  int dotColor;
  int size;
  BufferedImage actualDot;

  public static final int SIZE_S = 0;
  public static final int SIZE_N = 1;
  public static final int SIZE_M = 2;

  BufferedImage COLOR_0_S = ImageIO.read(new File("ball-0.png"));
  BufferedImage COLOR_1_S = ImageIO.read(new File("ball-1.png"));
  BufferedImage COLOR_2_S = ImageIO.read(new File("ball-2.png"));
  BufferedImage COLOR_3_S = ImageIO.read(new File("ball-3.png"));
  BufferedImage COLOR_4_S = ImageIO.read(new File("ball-4.png"));
  BufferedImage COLOR_5_S = ImageIO.read(new File("ball-5.png"));

  BufferedImage COLOR_0_N = ImageIO.read(new File("ball_0.png"));
  BufferedImage COLOR_1_N = ImageIO.read(new File("ball_1.png"));
  BufferedImage COLOR_2_N = ImageIO.read(new File("ball_2.png"));
  BufferedImage COLOR_3_N = ImageIO.read(new File("ball_3.png"));
  BufferedImage COLOR_4_N = ImageIO.read(new File("ball_4.png"));
  BufferedImage COLOR_5_N = ImageIO.read(new File("ball_5.png"));

  BufferedImage COLOR_0_M = ImageIO.read(new File("ball0.png"));
  BufferedImage COLOR_1_M = ImageIO.read(new File("ball1.png"));
  BufferedImage COLOR_2_M = ImageIO.read(new File("ball2.png"));
  BufferedImage COLOR_3_M = ImageIO.read(new File("ball3.png"));
  BufferedImage COLOR_4_M = ImageIO.read(new File("ball4.png"));
  BufferedImage COLOR_5_M = ImageIO.read(new File("ball5.png"));



  //row is y coordinate, column is the x coordinate, color is 1/6 and size is 1/3
  //
    public DotButton(int row, int column, int color, int iconSize) {
      this.dotColor = color;
      this.size = iconSize;
      this.dotX = column;
      this.dotY = row;
    }


    public DotButton(int color, int iconSize) {

    }

    public void setColor(int color) {

    }


    public int getColor(){
      return dotColor;
    }


    public int getRow() {
      return dotY;
    }


    public int getColumn(){
      return dotX;
    }

    switch(size){
      case 0: color_switch_S();
      break;
      case 1: color_switch_N();
      break;
      case 2: color_switch_M();
      break;
    }

    color_switch_S(){
      switch(dotColor){
        case 0: actualDot = COLOR_0_S;
        break;
        case 1: actualDot = COLOR_1_S;
        break;
        case 2: actualDot = COLOR_2_S;
        break;
        case 3: actualDot = COLOR_3_S;
        break;
        case 4: actualDot = COLOR_4_S;
        break;
        case 5: actualDot = COLOR_5_S;
        break;
      }
    }

    color_switch_N(){
      switch(dotColor){
        case 0: actualDot = COLOR_0_N;
        break;
        case 1: actualDot = COLOR_1_N;
        break;
        case 2: actualDot = COLOR_2_N;
        break;
        case 3: actualDot = COLOR_3_N;
        break;
        case 4: actualDot = COLOR_4_N;
        break;
        case 5: actualDot = COLOR_5_N;
        break;
      }
    }

    color_switch_M(){
      switch(dotColor){
        case 0: actualDot = COLOR_0_M;
        break;
        case 1: actualDot = COLOR_1_M;
        break;
        case 2: actualDot = COLOR_2_M;
        break;
        case 3: actualDot = COLOR_3_M;
        break;
        case 4: actualDot = COLOR_4_M;
        break;
        case 5: actualDot = COLOR_5_M;
        break;
      }
    }






}
