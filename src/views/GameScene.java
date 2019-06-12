package views;
import controllers.KeyHandler;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class GameScene extends JFrame {

    private Drawpane drawpane;
    private Dashboard dashboard;

    public GameScene() {
    this.drawpane = new Drawpane();
    this.dashboard = new Dashboard();
    addKeyListener(new KeyHandler());
    setTitle("PROG2 ASS Snake Zakaria Karboub");
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());
    add(this.drawpane, BorderLayout.CENTER);
    add(this.dashboard,BorderLayout.SOUTH);

    setSize(773, 688);
    setResizable(false);
    setVisible(true);
    setLocationRelativeTo(null);
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
