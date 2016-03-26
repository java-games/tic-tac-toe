package tic.tac.toe.app;

import javax.swing.JFrame;

class Window extends JFrame {

	private static final long serialVersionUID = 1L;

	public Window() {
		setTitle("Tic Tac Toe");
		setSize(800, 600); // default size is 0,0
		setLocation(500, 200); // default is 0,0 (top left corner)
	}
}
