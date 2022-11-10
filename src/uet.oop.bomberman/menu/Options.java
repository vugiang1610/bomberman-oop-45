


package uet.oop.bomberman.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSlider;
import javax.swing.KeyStroke;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import uet.oop.bomberman.Game;
import uet.oop.bomberman.gui.Frame;

public class Options extends JMenu implements ChangeListener{
    Frame _frame;
	@Override
	public void stateChanged(ChangeEvent e) {
		JSlider source = (JSlider)e.getSource();
	    if (!source.getValueIsAdjusting()) {
	        int fps = (int)source.getValue();
	        Game.SCALE = fps;
	        System.out.println( Game.SCALE);
	        _frame._gamepane.changeSize();
			_frame.revalidate();
			_frame.pack();
	    }
	}
}
