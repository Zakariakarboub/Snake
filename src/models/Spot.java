package models;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

public class Spot {
    private Point position;
    private Marker type;

    public Spot(Marker spot) {
        this.type = spot;
        this.position = new Point(this.Random(1, 16), this.Random(1,13));
    }

    private int Random(int min, int max) {
        return (int) ((Math.random() * (max+1-min)) + min);
    }

    public Image getImage() {
        Image image = null;
        String choice = "";
        switch(this.type) {
            case MOUSE: choice = "mouse";
            break;
            case BEAR: choice = "bear";
            break;
            case FIRE: choice = "fire";
            break;
        }
        try {
            image = ImageIO.read(this.getClass().getResource("/images/"+choice+".png")).getScaledInstance(40,40,Image.SCALE_DEFAULT);
        }
        catch(IOException e) {
            e.getLocalizedMessage();
        }
        return image;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }
}
