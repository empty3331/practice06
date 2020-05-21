package com.javaex.ex02;

public class ShapeApp {

	public static void main(String[] args) {
		
		
		//생성자 사용 예상실험
		
		Shape s1 = new Shape("파랑", "파랑"); //생성자 Shape(1) 실행 예상
		System.out.println("================");
		
		Triangle t1 = new Triangle();        //생성자 Shape(0)>Shape(2) 실행 예상
		System.out.println("================");
		
		Triangle t2 = new Triangle(3, 4);	//생성자 Shape(0)>Shape(3) 실행 예상
		System.out.println("================");
		
		Shape t3 = new Triangle("빨강", "빨강", 15, 15); //생성자 Shape(1)>Shape(4) 실행 예상
		System.out.println("================");
		
		s1.showInfo();
		t1.showInfo();
		t2.showInfo();
		t3.showInfo();
	}

}

