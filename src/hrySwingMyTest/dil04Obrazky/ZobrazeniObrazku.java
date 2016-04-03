package hrySwingMyTest.dil04Obrazky;

import javax.swing.JFrame;

public class ZobrazeniObrazku extends JFrame {

    public ZobrazeniObrazku() {
        this.setTitle("Zobrazen� Obr�zku");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        KresliciPanel panel = new KresliciPanel();
        this.add(panel);

        this.setResizable(false);
        this.pack();
    }

    public static void main(String[] args) {
        ZobrazeniObrazku zo = new ZobrazeniObrazku();
        zo.setVisible(true);
    }
}