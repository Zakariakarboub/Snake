package models;

public class Game {
    private Snake snake;
    private boolean run;
//    private int time;
//    private ArrayList<Spot> mouses, bears, fires;

    public Game() {
        this.snake = new Snake();
        this.run = false;
        this.snake.setGetRun(this.run);
//        time = time(5000);
//        snake   = new Snake();
//        mouses  = new ArrayList<Spot>();
//        bears   = new ArrayList<Spot>();
//        fires   = new ArrayList<Spot>();
    }

    public Snake getSnake() {
        return snake;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    public boolean getRun() {
        return run;
    }

    public void setRun(boolean run) {
        this.run = run;
    }
}
