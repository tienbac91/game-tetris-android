package com.mygdx.game.tetris;

public class BrickType6 extends Brick
{
	private static int[][] a = { { 0, 0, 0, 0 }, { 0, 1, 1, 0 },
			{ 0, 1, 0, 0 }, { 0, 1, 0, 0 } };

	private static int[][] b = { { 0, 0, 0, 0 }, { 1, 1, 1, 0 },
			{ 0, 0, 1, 0 }, { 0, 0, 0, 0 } };

	private static int[][] c = { { 0, 0, 0, 0 }, { 0, 1, 0, 0 },
			{ 0, 1, 0, 0 }, { 1, 1, 0, 0 } };

	private static int[][] d = { { 0, 0, 0, 0 }, { 1, 0, 0, 0 },
			{ 1, 1, 1, 0 }, { 0, 0, 0, 0 } };

	public BrickType6()
	{
		super(4);
		this.array[0] = a;
		this.array[1] = b;
		this.array[2] = c;
		this.array[3] = d;

	}

	@Override
	public Brick Clone()
	{
		return new BrickType6();
	}

}
