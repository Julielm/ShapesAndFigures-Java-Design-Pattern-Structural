package fr.iutvalence.info.dut.m3105.preamble;

import com.sun.prism.paint.Color;

public class SolidFillShapeDecorator extends ShapeDecorator
{

	private Color color;

	public SolidFillShapeDecorator(Color color, Shape shape)
	{
		super(shape);
		this.color=color;
	}
	
	public String toString(){
		return this.shape.toString()+", (color="+this.color.toString()+")";
	}

}
