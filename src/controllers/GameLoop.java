package controllers;

public class GameLoop extends Thread implements Runnable {

    private long delay = 100;
    private GameController gamecontroller;

    public GameLoop() {
        this.gamecontroller = new GameController();
    }

    @Override
    public void run() {
        try {
            while (this.gamecontroller.getGame().getRun()) {
                sleep(this.delay);
                this.gamecontroller.loop();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void thread(boolean state) {
        if(state) {
            start();
        } else {
            try {
                sleep(0);
                this.gamecontroller.resume();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public void substract(int time) { this.delay -= time; }
}