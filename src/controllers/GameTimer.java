package controllers;
import models.Game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class GameTimer extends Timer {

    private GameController gameController;

    public GameTimer(int delay, ActionListener listener) {
        super(delay, listener);
        this.gameController = new GameController();
        ActionListener taskPerformer = new ActionListener() {

            /* TIME COUNTER */
            public void actionPerformed(ActionEvent e) {
                gameController.time();
              setRepeats(true);
            }
        };
        addActionListener(taskPerformer);
        setRepeats(true);
    }
}