package com.javaex.ex01;

public class Person {
	
	//필드
	private String  name; //고객이름
	private String hp;	//핸드폰
	
	//생성자
	public Person() {}
	public Person(String name, String hp) {
		this.name = name;
		this.hp = hp;
	}
	
	// g/s
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	
	
	//일반메소드
	public void showInfo() {
		System.out.println("#이름:"+name+", #핸드폰:"+hp);
	}
	
	//toString
	@Override
	public String toString() {
		return "Person [name=" + name + ", hp=" + hp + "]";
	}
	
}
