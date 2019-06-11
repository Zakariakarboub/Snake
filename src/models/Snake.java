package models;

import java.awt.*;
import java.util.ArrayList;

public class Snake {
    private Point position;
    private ArrayList<BodyPart> tail;
    private Direction dir;


    public Snake() {

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
