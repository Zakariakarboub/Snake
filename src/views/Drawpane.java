package views;

import controllers.GameController;
import models.Marker;
import models.Spot;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

public class Drawpane extends JPanel {

    private GameController gamecontroller;

    private int cols = 19;
    private int rows = 15;
    private int tileWith = 40;
    private int tileHeight = 40;
    private int gridWidth = 760;
    private int gridHeight = 650;

    public Drawpane() {
        //setPreferredSize(new Dimension(width, height));
    }

    public void passGameController(GameController game) {
        this.gamecontroller = game;
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
        super.paintComponent(g2);

        g2.fillRect(0, 0, gridWidth, gridHeight);

        for (int x = 0; x < cols; x++) {
            for (int y = 0; y < rows; y++) {
                if (y % 2 != 0 && x % 2 != 0) {
                    g2.setColor(Color.DARK_GRAY);
                } else if (y % 2 == 0 && x % 2 == 0) {
                    g2.setColor(Color.black);
                } else {
                    g2.setColor(Color.GRAY);
                }
                g2.fillRect(x * tileWith, y * tileWith, tileWith, tileHeight);
            }
        }
        for (int i = 0; i < 3; i++) {
            Spot mark = new Spot(Marker.MOUSE);
            g.drawImage(mark.getImage(), mark.getPosition().x * 40, mark.getPosition().y * 40, null);
        }
        for (int i = 0; i < 2; i++) {
            Spot mark = new Spot(Marker.FIRE);
            g.drawImage(mark.getImage(), mark.getPosition().x * 40, mark.getPosition().y * 40, null);
        }
        for (int i = 0; i < 1; i++) {
            Spot mark = new Spot(Marker.BEAR);
            g.drawImage(mark.getImage(), mark.getPosition().x * 40, mark.getPosition().y * 40, null);
        }
    }
}
