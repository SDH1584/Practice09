package com.javaex.ex04;

public class RectTriangle extends Shape {

	private double width;
	private double height;

	public RectTriangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getArea() {
		return width * height * 0.5;
	}
	
	public double getPerimeter() {
		double perimeter = width*width + height*height;
		return width + height + Math.sqrt(perimeter);
	}

}