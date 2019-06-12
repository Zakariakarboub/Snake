package views;

import controllers.GameController;
import controllers.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Hashtable;

public class Dashboard extends JPanel {

    private int gameSpeed = 1;
    private GameController gameController;
    private JButton start;
    private JButton exit;
    private JSlider slider;
    private JLabel  timer;

    public Dashboard() {
        this.start = new JButton("Play");
        this.exit = new JButton("Exit");
        this.slider = new JSlider(JSlider.HORIZONTAL, 1, 12, 1);
        this.timer = new JLabel("00:00:0000");
        this.showDashboard();
    }
    public GameController getGameController() {
        return gameController;
    }

    public void setGameController(GameController gameController) {
        this.gameController = gameController;
    }

    public JButton getStart() {
        return start;
    }

    public void setStart(JButton start) {
        this.start = start;
    }

    public JButton getExit() {
        return exit;
    }

    public void setExit(JButton exit) {
        this.exit = exit;
    }

    public JSlider getSlider() {
        return slider;
    }

    public void setSlider(JSlider slider) {
        this.slider.setValue(this.gameSpeed);
    }

    public JLabel getTimer() {
        return timer;
    }

    public void setTimer(String timer) {
        this.timer.setText(timer);
    }

    public void setButtonText(String text) {
        this.start.setText(text);
    }

    public void showSlider() {
        add(this.slider);
        this.slider.setEnabled(false);
        Hashtable<Integer, JLabel> labels = new Hashtable<Integer, JLabel>();
        for(int x = 1; x < 13; x++) {
            labels.put(x, new JLabel(Integer.toString(x)));
        }
        this.slider.setPreferredSize(new Dimension(300, 35));
        this.slider.setLabelTable(labels);
        this.slider.setPaintLabels(true);
    }

    public void constrainer(JComponent button, int height, int width) {
        GridBagConstraints cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 0;
        cons.insets = new Insets(10,10,10,10);
        button.setPreferredSize(new Dimension(height, width));
        add(button, cons);

        setAlignmentX(JComponent.CENTER_ALIGNMENT);
        setBackground(Color.lightGray);
        setCursor(new Cursor(12));
    }

    public void showDashboard() {
        this.constrainer(this.start, 100,35);
        this.constrainer(this.exit,100,35);
        this.showSlider();
        this.constrainer(this.timer, 100,30);

        /* BUTTON ACTIONLISTENER */
        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                /* PLAY/PAUSE BUTTON */
                if (!gameController.getGame().getRun()) {
                    gameController.run(true); }
                else { gameController.run(false); }
            }
        });


        exit.addActionListener(e -> System.exit(0));

        slider.setEnabled(false);
        slider.setMajorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setSnapToTicks(true);
        Hashtable<Integer, JLabel> speedLbl = new Hashtable<Integer, JLabel>();
        for (int i = 1; i <= 12; i++) { speedLbl.put(i, new JLabel(Integer.toString(i))); }
        slider.setLabelTable(speedLbl);
        slider.setPaintLabels(true);

    }
}
