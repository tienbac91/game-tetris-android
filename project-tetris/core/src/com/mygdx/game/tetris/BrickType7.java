package com.mygdx.game.tetris;

public class BrickType7 extends Brick
{
	private static int[][] a = { { 0, 0, 0, 0 }, { 0, 1, 1, 0 },
			{ 1, 1, 0, 0 }, { 0, 0, 0, 0 } };

	private static int[][] b = { { 1, 0, 0, 0 }, { 1, 1, 0, 0 },
			{ 0, 1, 0, 0 }, { 0, 0, 0, 0 } };

	public BrickType7()
	{
		super(2);
		this.array[0] = a;
		this.array[1] = b;
	}

	@Override
	public Brick Clone()
	{
		return new BrickType7();
	}
}
