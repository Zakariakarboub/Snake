package models;

public class Game {
    private Snake snake;
    private boolean isRunning;
//    private int time;
//    private ArrayList<Spot> mouses, bears, fires;

    public Game() {
        isRunning = false;
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

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }
}
