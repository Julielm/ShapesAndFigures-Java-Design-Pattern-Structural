package fr.iutvalence.info.dut.m3105.preamble;

public class BorderShapeDecorator extends ShapeDecorator
{

	private int thickness;

	public BorderShapeDecorator(int thickness, Shape shape)
	{
		super(shape);
		this.thickness=thickness;
	}
	
	public String toString(){
		return this.shape.toString()+", (thickness="+this.thickness+")";
	}

}
