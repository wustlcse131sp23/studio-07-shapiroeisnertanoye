package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	
	private double length;
	private double width;
	private double area;
	private boolean isSquare;
	private double perimeter;
	private boolean isSmaller;
	
	public Rectangle(double l, double w) {
		this.length = l;
		this.width = w;
		this.area = w*l;
		this.perimeter=2*l + 2*w;
		this.isSquare = (length==width);
		this.isSmaller = false;
	}
	
	public static boolean isSmaller(Rectangle rec1, Rectangle rec2) {
		if (rec1.area<rec2.area)
		{
			return true;
		}
		return false;
	}
	
	public static void drawRectangle(Rectangle rec) {
		StdDraw.filledRectangle(0.5, 0.5,rec.width/2.0, rec.length/2.0);
	}

}
