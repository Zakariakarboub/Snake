package views;
import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class GameScene extends JFrame {

    private Drawpane drawpane;
    private Dashboard dashboard;

    public GameScene() {
    this.drawpane = new Drawpane();
    this.dashboard = new Dashboard();

    setTitle("PROG2 ASS Snake Zakaria Karboub");
    }

    public Drawpane getDrawpane() {
        return drawpane;
    }

    public void setDrawpane(Drawpane drawpane) {
        this.drawpane = drawpane;
    }

    public Dashboard getDashboard() {
        return dashboard;
    }

    public void setDashboard(Dashboard dashboard) {
        this.dashboard = dashboard;
    }
}
