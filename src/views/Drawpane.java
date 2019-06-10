package views;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

public class Drawpane extends JPanel{

    private int cols = 19;
    private int rows = 15;
    private int recW = 33;
    private int recH = 33;
    private int width = 760;
    private int height = 650;


    public Drawpane() {
        setPreferredSize(new Dimension(width, height));
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
        super.paintComponent(g2);

        g2.setColor(Color.black);
        g2.fillRect(0,0, width, height);

        for(int x = 0; x < cols; x++) {
            for (int y = 0; y < rows; y++) {
                g2.setColor(Color.GRAY);
                g2.drawRect(x * width + width, y * height + 7, width, height);
            }
        }
    }
}
