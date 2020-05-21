package com.javaex.ex02;

public class Shape {
	
	private String fillColor;
	private String lineColor;
	
	//생성자 순서 실험
	public Shape() {
		System.out.println("생성자 Shape(0) 실행");
	}
	
	public Shape(String fillColor,String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		System.out.println("생성자 Shape(1) 실행");
	}

	// g/s
	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	
	public void showInfo() {
		System.out.println("면색:"+fillColor+" 선색:"+lineColor);
	}
	
	
}

