package fpp.lab12;

public class Rectangle extends ClosedCurve {

	private double width;
	private double length;
	public Rectangle(double width, double length){
		this.length = length;
		this.width = width;
	}
	double computeArea() {
		return width*length;
	}
	


}
