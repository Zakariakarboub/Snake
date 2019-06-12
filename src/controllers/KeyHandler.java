package controllers;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import models.Direction;

public class KeyHandler implements KeyListener {

    GameController gameController;

    @Override
    public void keyPressed(KeyEvent e) {
        this.gameController = new GameController();
        switch (e.getKeyCode()) {
            /* ARROW KEYS */
            case KeyEvent.VK_DOWN:
                if (gameController.getGame().getSnake().getDir() != Direction.UP) {
                    gameController.getGame().getSnake().setDir(Direction.DOWN);
                }
                break;
            case KeyEvent.VK_RIGHT:
                if (gameController.getGame().getSnake().getDir() != Direction.LEFT) {
                    gameController.getGame().getSnake().setDir(Direction.RIGHT);
                }
                break;
            case KeyEvent.VK_LEFT:
                if (gameController.getGame().getSnake().getDir() != Direction.RIGHT) {
                    gameController.getGame().getSnake().setDir(Direction.LEFT);
                }
                break;
            case KeyEvent.VK_UP:
                if (gameController.getGame().getSnake().getDir() != Direction.DOWN) {
                    gameController.getGame().getSnake().setDir(Direction.UP);
                }
                break;
        }
    }
    @Override public void keyTyped(KeyEvent e) {  }
    @Override public void keyReleased(KeyEvent e) {  }
}
