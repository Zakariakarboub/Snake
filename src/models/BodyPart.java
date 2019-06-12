package models;

import java.awt.*;

public class BodyPart {
    private Point position;
    private int width;
    private int height;

    public BodyPart(int x, int y, int width, int height) {
        this.position = new Point(x,y);
        this.width = width;
        this.height = height;
    }

    public void showBody(Graphics g) {
        g.setColor(Color.ORANGE);
        g.fillOval(this.position.x, this.position.y, width, height);
    }
}
