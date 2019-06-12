package models;

import controllers.GameController;
import controllers.Main;

import java.awt.*;
import java.util.ArrayList;

public class Snake {
    private BodyPart bodyPart;
    private boolean getRun;
    private Point position;
    private ArrayList<BodyPart> tail;
    private int startSize;
    private int tileWidth;
    private int tileHeight;
    private Direction dir;
    private boolean gameOver = false;


    public Snake() {
        this.tileWidth = 40;
        this.tileHeight = 40;
        this.startSize = 4;
        this.tail = new ArrayList<BodyPart>();
        this.position = new Point(6, 4);
        this.bodyPart = new BodyPart(this.position.x, this.position.y, this.tileWidth, this.tileHeight);
        this.dir = bodyPart.getDir();

        for (int i = 0; i < startSize; i++) {
            tail.add(new BodyPart
                    (startSize - i, this.position.y, this.tileWidth, this.tileHeight));
        }
    }

    public void bear() {
        if(this.tail.size() >= 4) {
            this.tail = split(this.tail, 0);
            if(this.tail.size() < 4) {
                this.setGameOver(true);
            }
        }
    }

    public void showBody(Graphics g) {
        if (!this.getRun) {
            for (BodyPart part : tail) {
                part.showBody(g);
            }
            g.setColor(Color.red);
            g.fillOval((this.position.x * tileWidth), (this.position.y * tileHeight), tileWidth, tileHeight);
        } else {
            for (BodyPart part : tail) {
                part.showBody(g);
            }
            g.setColor(Color.red);
            g.fillOval((this.position.x * tileWidth + tileWidth), (this.position.y * tileHeight + tileHeight), tileWidth, tileHeight);

            for (int i = tail.size() - 1; i >= 1; i--) {
                tail.get(i).setPosition(new Point(tail.get(i - 1).getPosition().x, tail.get(i - 1).getPosition().y));
            }
            tail.get(0).setPosition(new Point(this.position.x, this.position.y));

            switch (this.dir) {
                case UP:
                    this.position.y--;
                    break;
                case DOWN:
                    this.position.y++;
                    break;
                case LEFT:
                    this.position.x--;
                    break;
                case RIGHT:
                    this.position.x++;
                    break;
            }
        }
    }

    private ArrayList<BodyPart> split(ArrayList<BodyPart> list, int roundUp) {
        ArrayList<BodyPart> first = new ArrayList<BodyPart>();
        ArrayList<BodyPart> second = new ArrayList<BodyPart>();
        int size = list.size();
        for (int i = 0; i < size / 2; i++) {
            first.add(list.get(i));
        }
        for (int i = size / 2; i < size; i++) {
            second.add(list.get(i));
        }
        return (roundUp == 0) ? first : second;
    }

    public void addTail(int count) {
        if (tail.size() < 1) {
            tail.add(new BodyPart(this.getPosition().x, this.getPosition().y, this.tileWidth, this.tileHeight));
        } else {
            for (int i = 0; i < count; i++) {
                tail.add(new BodyPart(tail.get(tail.size() - 1).getPosition().x, tail.get(tail.size() - 1).getPosition().y, this.tileWidth, this.tileHeight));
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

    public boolean isGetRun() {
        return getRun;
    }

    public void setGetRun(boolean getRun) {
        this.getRun = getRun;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }
    public boolean getGameOver() {
        return this.gameOver;
    }
}
