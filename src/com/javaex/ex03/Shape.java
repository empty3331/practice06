package com.javaex.ex03;

public class Shape {
	
	//필드
	protected String fillColor; //상속클래스도 사용 가능하게 하려면 protected 사용
	protected String lineColor;
	
	//생성자
	public Shape() {} //지정생성자를 쓰면 디폴트 생성자가 사라지므로 꼭 적어줘야 한다.
	public Shape(String fillColor, String lineColor) {
		super();
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}
	
	
	
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	
}

