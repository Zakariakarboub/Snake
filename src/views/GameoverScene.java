package views;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import controllers.GameController;
import controllers.Main;

public class GameoverScene extends JFrame {

    public GameoverScene(String lifetime) {
        setUndecorated(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setBackground(Color.red);
        setLayout(new GridBagLayout());
        GridBagConstraints cons = new GridBagConstraints();

        cons.fill = GridBagConstraints.VERTICAL;
        cons.gridx = 1;
        cons.insets = new Insets(25, 15, 25, 15);
        cons.weightx = 1;
        cons.weighty = 1;

        JLabel title = new JLabel("Game Over");
        title.setFont(new Font("Courier New", Font.PLAIN, 55));
        title.setForeground(Color.BLACK);
        JLabel endTime = new JLabel(lifetime);
        endTime.setFont(new Font("Courier New", Font.PLAIN, 25));
        endTime.setForeground(Color.WHITE);
    }
}