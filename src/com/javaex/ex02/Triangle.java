package com.javaex.ex02;

public class Triangle extends Shape{
	
	private int width;
	private int height;
	
	//생성자 순서실험
	public Triangle() {
		System.out.println("생성자 Shape(2) 실행");
	}

	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
		System.out.println("생성자 Shape(3) 실행");
	}

	public Triangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
		System.out.println("생성자 Shape(4) 실행");
	}

	// g/s
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	public void showInfo() {
		System.out.println("면색:"+getFillColor()+" 선색:"+getLineColor()+" 가로:"+width+" 세로:"+height);
	}
	
	
}


