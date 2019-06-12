package models;

import controllers.GameController;

import java.awt.*;
import java.util.ArrayList;

public class Snake {
    private GameController gameController;
    private Point position;
    private ArrayList<BodyPart> tail;
    private int startSize;
    private int tileWidth;
    private int tileHeight;
    private Direction dir;


    public Snake() {
        this.position = new Point(5,2);
        this.tileWidth = 40;
        this.tileHeight = 40;
        this.startSize = 4;

        for (int i = 4; i > startSize; i--) {
            tail.add(new BodyPart(startSize, this.position.y, this.tileWidth, this.tileHeight));
        }
    }

    public void showBody(Graphics g) {
        if(tail.size() > 3) {
            if () {
                for (BodyPart part : tail) {
                    part.showBody(g);
                }
            }
        }

    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public ArrayList<BodyPart> getTail() {
        return tail;
    }

    public void setTail(BodyPart tail) {
        this.tail.add(tail);
    }

    public Direction getDir() {
        return dir;
    }

    public void setDir(Direction dir) {
        this.dir = dir;
    }
}
