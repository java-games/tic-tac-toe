package tic.tac.toe.app;

public class Board {
	private int[][] matrix;

	public void init(int size) {
		matrix = new int[size][size];
	}

	public int[][] getMatrix() {
		return matrix;
	}
}
