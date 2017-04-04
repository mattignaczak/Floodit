import java.awt.*;
import java.awt.event.*;

public class GameController implements ActionListener{

GameModel model;
int size;
GameStack dots;
int totalClicks;
GameView gameView;


  public GameController(int size){
    this.size = size;
    model = new GameModel(size);
    reset();
    ;

  }
  public void reset(){
    model.reset();
    System.out.println(model);
  }
  public void actionPerformed(ActionEvent e){
    if(e.getSource() == button){ //reset
      totalClicks++;}
      //reset();
    //else if (e.getSource() == bQuit){ //quit
      //System.exit(0);
    /*}else if (e.getSource() == GameView.colorButton[i]){ //grey
      totalClicks ++;
    }else if (e.getSource() == GameView.colorButton[1]){ //orange
      totalClicks++;
    }else if (e.getSource() == GameView.colorButton[2]){ //blue
      totalClicks++;
    }else if (e.getSource() == GameView.colorButton[3]){ // green
    totalClicks++;
    }else if (e.getSource() == GameView.colorButton[4]){ //purple
      totalClicks++;
    }else if (e.getSource() == GameView.colorButton[5]){ //red

    }*/

  }

  public void selectColor(int color){
    DotInfo d;
    DotInfo checkSide;
    DotInfo checkBelow;
    GameStack<DotInfo> pickColor = new GameStack(size*size);

    for (int i = 0; i < size; i++){
      for (int j = 0; j < size; j++){
        if(model.isCaptured(i,j)){
          pickColor.push( model.dots[i * size][j]);
        }
      }
    }

    while (pickColor.isEmpty() == false) {
      d = pickColor.pop();
      for (int i = 0; i < size; i++){
        for (int j = 0; j < size; j++){
          checkSide = model.get(i+1, j);
          checkBelow = model.get(i, j+1);
          if (d == checkBelow && checkBelow.isCaptured() == false && checkBelow.getColor() == color){
            checkBelow.setCaptured(true);
            pickColor.push(checkBelow);
          } else if (d == checkSide && checkSide.isCaptured() == false && checkSide.getColor() == color){
            checkSide.setCaptured(true);
            pickColor.push(checkSide);
          }
        }
      }
    }

  }
}
