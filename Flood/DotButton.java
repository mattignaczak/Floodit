// ADD YOUR IMPORTS HERE
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
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

 */

public class DotButton extends JButton {

  public static final int SIZE_S = 0;
  public static final int SIZE_N = 1;
  public static final int SIZE_M = 2;

  int[] location = new int[2];
  int color;
  int iconSize;
  String buttonFolder;
  String buttonFullPath;
  BufferedImage button;




    public DotButton(int row, int column, int color, int iconSize) {
      this.iconSize = iconSize;
      this.setColor(color);
      this.location[0] = column;
      this.location[1] = row;




   }


    public DotButton(int color, int iconSize) {
      this.setColor(color);
      this.iconSize = iconSize;
      button = theButton();



    }

    public ImageIcon iconSet(){
      ImageIcon buttonIcon = new ImageIcon(button);
      return buttonIcon;
    }



    public void setColor(int color) {
      this.color = color;


   }

    public int getColor(){
    return color;


    }



    public int getRow() {
    return location[1];


    }


    public int getColumn() {
    return location[2];

    }


// ADD YOUR PRIVATE METHODS HERE (IF USING ANY)
  private String findPath(int iconSize){
  String pathData = "/data";
  String pathSize;
    if(iconSize == 0){
      pathSize = "/S";
      this.buttonFolder = pathData + pathSize;
    } else if (iconSize == 1){
      pathSize = "/N";
      this.buttonFolder = pathData + pathSize;
    } else if (iconSize == 2){
      pathSize = "/M";
      this.buttonFolder = pathData + pathSize;
    }
    return buttonFolder;
  }

  private String whichButton(int color){
    String fileName = "";
    switch(color){
      case 0: fileName = "/ball-0.png";
      break;
      case 1: fileName = "/ball-1.png";
      break;
      case 2: fileName = "/ball-2.png";
      break;
      case 3: fileName = "/ball-3.png";
      break;
      case 4: fileName = "/ball-4.png";
      break;
      case 5: fileName = "/ball-5.png";
    }
    this.buttonFullPath = buttonFolder + fileName;
    return buttonFullPath;
  }

  private BufferedImage theButton(){
    buttonFolder = findPath(iconSize);
    buttonFullPath = whichButton(color);
    try{
      this.button = ImageIO.read(getClass().getResource(buttonFullPath));
    } catch (IOException e){

    }
    return button;
  }

}
