package sample.controllers;
import sample.models.Game;
import sample.views.GameScene;

public class Controller {
        private Game game;
        private GameScene GameScene;
        private int heightBoard = 760;
        private int widthBoard = 600;
        

        game = new Game(this.widthBoard, this.heightBoard);
        this.createGame();
        this.drawPane = new DrawPane(this.widthBoard, this.heightBoard, game.getSnake(), game.getSpots());
        gameScene = new GameScene(this, this.drawPane);
        this.startGame();

}
