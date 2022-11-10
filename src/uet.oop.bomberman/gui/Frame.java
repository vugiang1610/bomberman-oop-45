package uet.oop.bomberman.gui;

import uet.oop.bomberman.Game;
import javax.swing.*;
import java.awt.*;
import uet.oop.bomberman.menu.Menu;
/**
 * Swing Frame chứa toàn bộ các component
 */
public class Frame extends JFrame {


	public GamePanel _gamepane;
	private JPanel _containerpane;
	private InfoPanel _infopanel;

	private Game _game;

	public Frame() {
		 setJMenuBar(new Menu(this));
		 _containerpane = new JPanel(new BorderLayout());
		_gamepane = new GamePanel(this);
		_infopanel = new InfoPanel(_gamepane.getGame());
		_containerpane.add(_infopanel, BorderLayout.PAGE_START);
		_containerpane.add(_gamepane, BorderLayout.PAGE_END);
		_game = _gamepane.getGame();
		add(_containerpane);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		_game.start();
	}
	public void setLives(int lives){
            	_infopanel.setLives(lives);
        }
        
	public void setTime(int time) {
		_infopanel.setTime(time);
	}

	// gọi ván mới
	public void newGame() {
			_game.getBoard().newGame();
        }
}
