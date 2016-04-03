package hrySwingMyTest.dil01Panel;

import javax.swing.JFrame;

public class MujProgram extends JFrame {

    MujProgram() {
        this.setTitle("Muj Program");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MujPanel panel = new MujPanel();
        this.add(panel);
        this.pack();
        
    }

    public static void main(String[] args) {
        MujProgram program = new MujProgram();
        program.setVisible(true);
    }
}


