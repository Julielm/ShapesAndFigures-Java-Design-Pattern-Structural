package fr.iutvalence.info.dut.m3105.preamble;

public class Rectangle extends Shape
{

	private int width;
	
	private int height;

	public Rectangle(int width, int height)
	{
		this.width=width;
		this.height=height;
	}
	
	public String toString()
	{
		return "rectangle (w="+this.width+", h="+this.height+")";
	}
	
	public int getWidth()
	{
		return width;
	}

	public int getHeight()
	{
		return height;
	}

}
