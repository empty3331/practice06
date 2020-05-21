package com.javaex.ex01;

public class Customer extends Person{
	
	private int cNo; //고객넘버
	private int point; //포인트점수
	
	
	//생성자
	public Customer() {}
	public Customer(String name, String hp, int cNo, int point) {
		super(name, hp);
		this.cNo = cNo;
		this.point = point;
	}
	
	// g/s
	public int getcNo() {
		return cNo;
	}
	public void setcNo(int cNo) {
		this.cNo = cNo;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	
	//일반메소드
	public void showInfo() {
		System.out.println("#이름:"+getName()+", #핸드폰:"+getHp()+", #고객번호:"
	+cNo+", #포인트점수:"+point);
	}
	
	//toString
	@Override
	public String toString() {
		return "Customer [cNo=" + cNo + ", point=" + point + "]";
	}
	
	
	

	
}
