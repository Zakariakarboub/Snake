package controllers;

import models.Game;
import views.GameScene;
import views.GameoverScene;
import javax.swing.Timer;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GameController {

    private Game game;
    private GameScene gameScene;
    private GameLoop gameLoop;
    private GameoverScene gameoverScene;
    private Timer gameTimer;
    private long timer = 0;
    private long speed = 0;
    private int delay = 5;


    public GameController() {
        this.game = new Game();
        this.gameLoop = new GameLoop();
        //this.gameTimer = new GameTimer(1,null);
    }

    public void level() {
        this.gameLoop.substract(rand()+3);
        this.gameScene.getDashboard().setSpeed(1);
        this.game.getSnake().addTail(rand());
        this.gameScene.getDashboard().setSlider();
    }

    private int rand() { return (int) ((Math.random() * (5+1-1)) + 2); }

    public void loop() {
        if ((this.game.getSnake().getPosition().x > (19 * 40) || game.getSnake().getPosition().x < 1) || (game.getSnake().getPosition().y > (15 * 40) || game.getSnake().getPosition().y < 1)) {
            this.showGameOverScene();
        } else {
            this.gameScene.getDrawpane().repaint();
            this.game.collision();
        }
        if (speed > 0 && speed % (this.delay*10) == 0) { level();
        }   speed++;
    }
    // moet nog gebruiken in gametimer.java! UITZOEKEN
    public void time() {
        gameScene.getDashboard().setTimer(getTimeString());
        timer++;
    }


    public void showGameOverScene() {
        if(this.getGame().getSnake().getGameOver()) {
            this.run(false);
            this.gameoverScene = new GameoverScene(getTimeString());
            this.gameScene.setVisible(false);
            this.gameScene.dispose();
        }
    }

    public String covertTime(long time) {
        return (new SimpleDateFormat("mm:ss.SSS")).format(new Date(time));
    }
    public String getTimeString() {
        return this.covertTime(timer);
    }

    public void run(boolean state) {
        this.gameScene.requestFocus();
        this.gameLoop.thread(state);
        this.game.run(state);
        if (state) {
            this.gameScene.getDashboard().setButtonText("Pause");
            this.gameTimer.start();
        } else {
            this.gameScene.getDashboard().setButtonText("Play");
            this.gameTimer.stop();
        }
    }

    public void resume() {
        this.gameLoop = new GameLoop();
    }

    public void showGameScene() {
        this.gameScene = new GameScene();
        this.gameScene.getDrawpane().passGameController(this);
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public GameScene getGameScene() {
        return gameScene;
    }

    public void setGameScene(GameScene gameScene) {
        this.gameScene = gameScene;
    }
}