package fr.iutvalence.info.dut.m3105.preamble;

public class Position
{

	private int x;
	private int y;

	public Position(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	
	public String toString()
	{
		return "("+this.x+","+this.y+")";
	}

	public int getX()
	{
		return x;
	}

	public int getY()
	{
		return y;
	}

}
