package models;

import java.awt.*;

public class BodyPart {
    private Point position;
    private int width;
    private int height;
    private Direction dir;

    public BodyPart(int x, int y, int width, int height) {
        this.position = new Point(x,y);
        this.width = width;
        this.height = height;
    }

    public void showBody(Graphics g) {
        g.setColor(Color.ORANGE);
        g.fillOval(this.position.x * this.width + width, this.position.y * this.height, width, height);
    }
    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public Direction getDir() {
        return dir;
    }

    public void setDir(Direction dir) {
        this.dir = dir;
    }
}
