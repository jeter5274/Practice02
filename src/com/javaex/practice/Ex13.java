package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		double num, result;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요");
		System.out.print("숫자 : ");
		num = sc.nextDouble();
		
		if(num > 0) {
			result = 7*num + 2;
		}else{
			result = (num*num*num)- 9*num + 2;
			//result = Math.pow(num, 3)- 9*num + 2; 제곱근 연산자 사용
		}
		System.out.println("계산 결과는 " +result+ " 입니다.");
		
		sc.close();
		
	}

}
