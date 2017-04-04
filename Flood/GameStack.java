

public class GameStack<G> implements Stack<G>{



  G[] gameStack;
  int top;

  public GameStack(int capacity) {
    gameStack = (G[]) new Object[ capacity ];
    top = 0;
  }

  public boolean isEmpty(){
    return (top == 0);
  }

  public G peek(){
    return gameStack[top - 1];
  }

  public G pop(){
    G saved = gameStack[ --top ];
    gameStack [top] = null;
    return saved;
  }

  public void push(G element){
    gameStack[top ++] = element;
  }


}
