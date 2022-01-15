package com.javaex.ex04;

public class Rectangle extends Shape implements Resizeable {

	private double width;
	private double height;

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter() {
		return (width + height) * 2.0;
	}
	
	public void resize(double s) {
		width = width * s;
		height = height * s;
	}

}