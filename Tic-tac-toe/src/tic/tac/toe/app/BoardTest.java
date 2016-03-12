package tic.tac.toe.app;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * @author georgi
 * 
 */
public class BoardTest {

	@Test
	public void testDraw() {
		
		Board board = new Board();
		board.init(3);
		int[][] arr = board.getMatrix();
		assertEquals(3, arr.length);
		assertEquals(3, arr[2].length);
	}
}

