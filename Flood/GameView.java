
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class GameView extends JFrame{

	//gridbag variables
	final static boolean shouldFill = true;
	final static boolean shouldWeightX = true;

	//normal variables
	int gameSize = 12;
	int NUMBER_OF_COLORS = GameModel.NUMBER_OF_COLORS;
	int steps = GameController.totalClicks; //stepcounter
	int[][] gameBoard = new int[gameSize][gameSize];
	JButton colorButton[];
	JButton button;


  public GameView(GameModel model, GameController gameController){
  super("Game GUI");
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	//overall layout (GRIDBAG)
	setLayout(new GridBagLayout());
	GridBagConstraints c = new GridBagConstraints();
	if(shouldFill){
		c.fill = GridBagConstraints.HORIZONTAL;
	}
	JPanel game = new JPanel();
	c.fill = GridBagConstraints.BOTH;
	c.gridx = 0;
	c.gridy = 0;
	c.weightx = 0.5;
	c.insets = new Insets(2,6,2,6) ;
	add(game,c);

	JPanel colorSelect = new JPanel();
	c.fill = GridBagConstraints.HORIZONTAL;
	c.gridx = 0;
	c.gridy = 1;
	c.weightx = 0.5;
	c.insets = new Insets(2,6,2,6) ;
	add(colorSelect,c);

	JPanel bottom = new JPanel();
	c.fill = GridBagConstraints.HORIZONTAL;
	c.gridy = 2;
	c.gridx = 0;
	c.weightx = 0.5;
	c.insets = new Insets(2,6,2,6) ;
	add(bottom,c);

  //Gameboard
  game.setLayout(new GridLayout(gameSize,gameSize));
	/*for (int x = 0; x < gameSize; x++){
		for (int y = 0; y< gameSize; y++){
			DotInfo getting = GameModel.get(y,x);

			DotButton dot1 = new DotButton(colour,1);

			JButton gameButton = new JButton();
			gameButton.setIcon(dot1.iconSet());
			gameButton.setBorder(BorderFactory.createEmptyBorder());
			gameButton.setContentAreaFilled(false);
			game.add(gameButton);
		}
	}
*/

  // Color select Buttons

  colorSelect.setLayout(new GridLayout(1,6));
  colorSelect.setBorder(BorderFactory.createLineBorder(Color.black,2));
	//actual buttons
	int buttonSize = 1;
	colorButton = new JButton[6];
	for (int i = 0; i < NUMBER_OF_COLORS; i++){
		DotButton dot = new DotButton(i, buttonSize);
		colorButton[i] = new JButton();
		colorButton[i].setIcon(dot.iconSet());
		colorButton[i].setBorder(BorderFactory.createEmptyBorder());
		colorButton[i].setContentAreaFilled(false);
		colorButton[i].addActionListener(gameController);
		colorSelect.add(colorButton[i]);


	}


  // Bottom buttons and counter for the game

  bottom.setLayout(new GridLayout(1,3));
  //bottom.setPreferredSize(new Dimension(80,150));
  JLabel count = new JLabel("Number of Steps: " + steps);
  JButton button = new JButton( "Reset" );
	button.addActionListener(gameController);
  JButton bQuit	= new JButton( "Quit");
	bQuit.addActionListener(gameController);

  bottom.add(count);
  bottom.add(button);
  bottom.add(bQuit);



  setSize(500,500);
  setVisible(true);

  }
  public void update(){

  }
}
