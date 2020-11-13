package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		
		int age = 15;
		
		//age가 0살 초과이고 18살 미만이면
		//if(0 < age < 18) if문의 조건식은 1개 관계연산만 가능하여, 조건식을 2개로 나눈뒤 논리연산을 통해 조건을 만들어준다. 
		if(0 < age && age < 18) {
			System.out.println("청소년 입니다");
		}
	}

}
