package hrySwingMyTest.dil02Kresleni;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class KresliciPanel2 extends JPanel {
    private int[] souradniceX = {
        50, 50, 70, 70, 90, 90, 110, 110,
        130, 130, 150, 150, 250, 250, 270,
        270, 290, 290, 310, 310, 330, 330,
        350, 350, 330, 330, 300, 270, 270};
    private int[] souradniceY = {
        300, 120, 120, 140, 140, 120, 120,
        140, 140, 120, 120, 200, 200, 50,
        50, 70, 70, 50, 50, 70, 70, 50, 50,
        300, 300, 240, 210, 240, 300};

    public KresliciPanel2() {
        this.setPreferredSize(new Dimension(400, 300));
        this.setBackground(Color.blue);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // parametry: pole souradnic bodu x, pole souradnice bodu y, pocet bodu
        g.setColor(Color.darkGray);
        g.fillPolygon(souradniceX, souradniceY, souradniceX.length);
        g.drawPolygon(souradniceX, souradniceY, souradniceX.length);
    }
}