package hrySwingMyTest.dil03KresleniText;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import javax.swing.JPanel;

public class KresliciPanel2 extends JPanel {
    private String text = "GAME OVER";

    public KresliciPanel2() {
        this.setPreferredSize(new Dimension(400, 300));
        this.setBackground(Color.BLUE);
    }

    public void paintComponent(Graphics g) {
        //vykresleni pozadi
        super.paintComponent(g);

        //nastaveni typu a velikosti pisma
        Font pismo = new Font(Font.SANS_SERIF, Font.BOLD, 28);
        g.setFont(pismo);

        //nastaveni barvy
        g.setColor(Color.RED);

        //ziskani s�rky a vysky panelu
        int sirkaPanelu = this.getWidth();
        int vyskaPanelu = this.getHeight();

        //objekt FontMetrics pro dany typ pisma
        FontMetrics fm = g.getFontMetrics(pismo);

        //ziskani sirky a vysky textu v danem grafickem kontextu
        int sirkaTextu = fm.stringWidth(text);

        //nakresleni textu na dane umisteni
        g.drawString(text, ((sirkaPanelu - sirkaTextu) / 2), (vyskaPanelu / 2));
    }
}
