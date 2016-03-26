package tic.tac.toe.app;


/**
 * @author georgi
 * 
 */
public class Main {

	public static void main(String[] args) {
	    Window window = new Window();
	    Board board = new Board();
		board.init(3);
		board.draw(window);
	    window.setVisible(true);
	}
}
