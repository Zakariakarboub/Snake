package models;

import java.util.ArrayList;

public class Game {
    private Snake snake;
    private Spot spot;
    private boolean run;
    private int time;
    private ArrayList<Spot> mouses, bears, fires;

    public Game() {
        this.snake = new Snake();
        this.run = false;
        this.snake.setGetRun(this.run);
        time = time(5000);
        snake   = new Snake();
        mouses  = new ArrayList<Spot>();
        bears   = new ArrayList<Spot>();
        fires   = new ArrayList<Spot>();
    }
    public void run(boolean state) {
        this.run = state;
    }

    public Snake getSnake() {
        return snake;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    public boolean getRun() {
        return this.run;
    }
    public void collision() {
        /* COLLIDED WITH MOUSE += 5 BODYPARTS */
        for (Spot mouse : mouses) {
            if (snake.getPosition().x == mouse.getPosition().x && snake.getPosition().y == mouse.getPosition().y) {
                snake.addTail(5); mouse.relocate();
            }}
        /* COLLIDED WITH BEAR = SLICE (<4 = GAME OVER */
           for (Spot bear : bears) {
               if (snake.getPosition().x == bear.getPosition().x && snake.getPosition().y == bear.getPosition().y) {
                   snake.bear(); bear.relocate();
                } }
            /* COLLIDED WITH FIRE = DEAD -> GAME OVER */
            for (Spot fire : fires) {
                if (snake.getPosition().x == fire.getPosition().x && snake.getPosition().y == fire.getPosition().y) {
                   this.getSnake().setGameOver(true);
               } }
           /* COLLIDED WITH SELF = GAME OVER */
           for (BodyPart body : snake.getTail()) {
              if (snake.getPosition().x == body.getPosition().x && snake.getPosition().y == body.getPosition().y) {
                    this.getSnake().setGameOver(true);
                }}
    }
    private int time(int max) {
        return (int) ((Math.random() * (((max < 3000) ? 5000 : max) +1-3000)) + 3000);
    }


    public void setRun(boolean run) {
        this.run = run;
    }
}
