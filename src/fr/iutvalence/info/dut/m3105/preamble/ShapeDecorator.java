package fr.iutvalence.info.dut.m3105.preamble;

public abstract class ShapeDecorator extends Shape
{
	protected Shape shape;
	
	public ShapeDecorator(Shape shape)
	{
		this.shape=shape;
	}


}
