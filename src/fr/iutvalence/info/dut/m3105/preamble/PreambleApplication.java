package fr.iutvalence.info.dut.m3105.preamble;

public class PreambleApplication
{
	public static void main(String[] args)
	{
		Shape rectangle=new Rectangle(2,7);
		Shape circle= new Circle(3);
		rectangle.draw(new Position(3,4));
		circle.draw(new Position(0,1));
	}

}
