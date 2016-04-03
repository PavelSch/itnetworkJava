package hrySwingMyTest.dil03KresleniText;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class KresliciPanel extends JPanel {
    String text = "GAME OVER";

    public KresliciPanel() {
        this.setPreferredSize(new Dimension(400, 300));
        this.setBackground(Color.BLUE);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 28));
        g.setColor(Color.RED);
        g.drawString(text, 120, 150);
    }
}