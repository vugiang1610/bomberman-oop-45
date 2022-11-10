package uet.oop.bomberman.gui;

import uet.oop.bomberman.Game;
import javax.swing.*;
import java.awt.*;

/**
 * Swing Panel hiển thị thông tin thời gian, mạng
 */
public class InfoPanel extends JPanel {
	// nhãn 
	private JLabel timeLabel;
	private JLabel livesLabel;

	public InfoPanel(Game game) {
		setLayout(new GridLayout());
		
		timeLabel = new JLabel("Times: " + game.getBoard().getTime());
		timeLabel.setForeground(Color.WHITE);
		timeLabel.setHorizontalAlignment(JLabel.CENTER);

		livesLabel = new JLabel("Lives: " + game.getBoard().getLives());
		livesLabel.setForeground(Color.red);
		livesLabel.setHorizontalAlignment(JLabel.CENTER);

		add(timeLabel);
		add(livesLabel);

		setBackground(Color.black);
		setPreferredSize(new Dimension(0, 40));
	}
	// hiển thị thời gian
	public void setTime(int t) {
		timeLabel.setText("Time: " + t);
	}
	// hiển thị mạng
        public void setLives(int t) {
		livesLabel.setText("Lives: " + t);
	}
        
}
