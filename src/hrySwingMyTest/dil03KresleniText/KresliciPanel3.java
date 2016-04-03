package hrySwingMyTest.dil03KresleniText;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class KresliciPanel3 extends JPanel {

    private String text = "GAME OVER";
    private int size = 20;

    private Font monospacedPlain = new Font(Font.MONOSPACED, Font.PLAIN, size);
    private Font monospacedBold = new Font(Font.MONOSPACED, Font.BOLD, size);
    private Font monospacedItalic = new Font(Font.MONOSPACED, Font.ITALIC, size);
    private Font monospacedBoldItalic = new Font(Font.MONOSPACED, Font.BOLD + Font.ITALIC, size);

    private Font serifPlain = new Font(Font.SERIF, Font.PLAIN, size);
    private Font serifBold = new Font(Font.SERIF, Font.BOLD, size);
    private Font serifItalic = new Font(Font.SERIF, Font.ITALIC, size);
    private Font serifBoldItalic = new Font(Font.SERIF, Font.BOLD + Font.ITALIC, size);

    private Font sansserifPlain = new Font(Font.SANS_SERIF, Font.PLAIN, size);
    private Font sansserifBold = new Font(Font.SANS_SERIF, Font.BOLD, size);
    private Font sansserifItalic = new Font(Font.SANS_SERIF, Font.ITALIC, size);
    private Font sansserifBoldItalic = new Font(Font.SANS_SERIF, Font.BOLD + Font.ITALIC, size);



    public KresliciPanel3() {
        this.setPreferredSize(new Dimension(200, 600));
        this.setBackground(Color.white);
    }

    public void paintComponent(Graphics g) {
        //vykreslen� pozad�
        super.paintComponent(g);

        g.setFont(monospacedPlain);
        g.drawString(text, 20, 40);
        g.setFont(monospacedBold);
        g.drawString(text, 20, 80);
        g.setFont(monospacedItalic);
        g.drawString(text, 20, 120);
        g.setFont(monospacedBoldItalic);
        g.drawString(text, 20, 160);

        g.setFont(serifPlain);
        g.drawString(text, 20, 240);
        g.setFont(serifBold);
        g.drawString(text, 20, 280);
        g.setFont(serifItalic);
        g.drawString(text, 20, 320);
        g.setFont(serifBoldItalic);
        g.drawString(text, 20, 360);

        g.setFont(sansserifPlain);
        g.drawString(text, 20, 440);
        g.setFont(sansserifBold);
        g.drawString(text, 20, 480);
        g.setFont(sansserifItalic);
        g.drawString(text, 20, 520);
        g.setFont(sansserifBoldItalic);
        g.drawString(text, 20, 560);

    }
}
