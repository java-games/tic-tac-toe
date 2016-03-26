package tic.tac.toe.app;

import java.awt.Color;

import javax.swing.JPanel;

public class Board {

	private static final int OFFSET_X = 50;
	private static final int OFFSET_Y = 50;
	private static final int CUBE_SIZE = 100;
	private int[][] matrix;

	public void init(int size) {
		matrix = new int[size][size];
	}

	public int[][] getMatrix() {
		return matrix;
	}

	public void draw(Window window) {
		JPanel panel = new JPanel();
		panel.setBounds(OFFSET_X, OFFSET_Y, matrix.length * CUBE_SIZE, matrix.length
				* CUBE_SIZE);
		panel.setBackground(Color.BLACK);
		window.add(panel);
	}
}
