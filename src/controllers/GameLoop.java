package controllers;

import models.Game;

public class GameLoop extends Thread implements Runnable {

    private long delay = 100;
    private GameController gamecontroller;

    @Override
    public void run() {
        this.gamecontroller = new GameController();
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
        this.gamecontroller = new GameController();
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