package hrySwingMyTest.dil04Obrazky;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class KresliciPanel extends JPanel {

    private Image obrazek;
    private int obrazekSirka;
    private int obrazekVyska;

    public KresliciPanel() {

        ImageIcon ii = new ImageIcon(this.getClass().getResource("obrazek1.jpg"));
        obrazek = ii.getImage();

        obrazekSirka = obrazek.getWidth(this);
        obrazekVyska = obrazek.getHeight(this);

        int x = 20 + obrazekSirka + 20;
        int y = 20 + obrazekVyska + 20;
        Dimension rozmerPanelu = new Dimension(x, y);

        this.setPreferredSize(rozmerPanelu);
        this.setBackground(Color.WHITE);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(obrazek, 20, 20, this);
    }
}