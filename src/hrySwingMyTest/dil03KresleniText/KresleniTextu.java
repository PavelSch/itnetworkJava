package hrySwingMyTest.dil03KresleniText;

import javax.swing.JFrame;

public class KresleniTextu extends JFrame {

    public KresleniTextu() {
        this.setTitle("Kresleni Textu");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        KresliciPanel3 panel = new KresliciPanel3();
        this.add(panel);

        this.pack();
    }

    public static void main(String[] args) {
        new KresleniTextu().setVisible(true);
    }
}