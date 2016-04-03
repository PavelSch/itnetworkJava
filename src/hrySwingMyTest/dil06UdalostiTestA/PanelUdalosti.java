package hrySwingMyTest.dil06UdalostiTestA;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class PanelUdalosti extends JPanel {
    private KontrolniNavesti kontrolniNavesti;

    public PanelUdalosti() {
        this.setPreferredSize(new Dimension(300, 30));

        kontrolniNavesti = new KontrolniNavesti();
        this.add(kontrolniNavesti);

        PosluchacPanelu posluchacPanelu = new PosluchacPanelu();
        this. addKeyListener(posluchacPanelu);

        // komponenta z�sk� fokus
        this.setFocusable(true);
    }

    private class PosluchacPanelu implements KeyListener {
        @Override
        public void keyPressed(KeyEvent e) {
        	kontrolniNavesti.setText("Stisknul jsi kl�vesu: " + e.getKeyChar());
        }

        @Override
        public void keyReleased(KeyEvent e) {
        	kontrolniNavesti.setText("Pustil jsi kl�vesu jej� ��seln� k�d je: " + e.getKeyCode());
        }

        @Override
        public void keyTyped(KeyEvent e) {
            //is only generated if a valid Unicode character could be generated.
        }
    }
}