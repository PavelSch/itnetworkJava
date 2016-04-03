package hrySwingMyTest.dil02Kresleni;

import javax.swing.JFrame;

public class MujProgram extends JFrame {

    MujProgram() {
        this.setTitle("Muj Program");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        KresliciPanel2 panel = new KresliciPanel2();
        this.add(panel);
        this.pack();
        
    }

    public static void main(String[] args) {
        MujProgram program = new MujProgram();
        program.setVisible(true);
    }
}


