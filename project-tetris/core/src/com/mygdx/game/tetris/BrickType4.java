package com.mygdx.game.tetris;

public class BrickType4 extends Brick
{
	private static int[][] a = { { 0, 0, 0, 0 }, { 1, 1, 0, 0 },
			{ 1, 1, 0, 0 }, { 0, 0, 0, 0 } };

	public BrickType4()
	{
		super(1);
		this.array[0] = a;
	}

	@Override
	public Brick Clone()
	{
		return new BrickType4();
	}
}
