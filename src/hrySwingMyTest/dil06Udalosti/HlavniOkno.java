package hrySwingMyTest.dil06Udalosti;

import javax.swing.JFrame;

public class HlavniOkno extends JFrame {

    public HlavniOkno() {
        this.setTitle("Ud�losti");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PanelUdalosti panel = new PanelUdalosti();
        this.add(panel);

        this.pack();
    }

    public static void main(String[] args) {
        new HlavniOkno().setVisible(true);
    }
}