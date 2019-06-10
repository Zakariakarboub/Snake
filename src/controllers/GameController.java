package controllers;

import models.Game;
import views.GameScene;

public class GameController {
    private Game game;
    private GameScene gameScene;

    public GameController() {
        this.game = new Game();
    }

    public void showGameScene() {
        this.gameScene = new GameScene();
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