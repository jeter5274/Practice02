package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자2개를 입력해주세요");
		System.out.print("숫자1 : ");
		num1 = sc.nextInt();
		System.out.print("숫자2 : ");
		num2 = sc.nextInt();
		
		if(num1>num2) {
			if(num1%num2 == 0) {
				System.out.println(num2+ " 는(은) " +num1+ " 의 약수입니다.");
			}else {
				System.out.println(num2+ " 는(은) " +num1+ " 의 약수가 아닙니다.");
			}
		}else{
			if(num2%num1 == 0) {
				System.out.println(num1+ " 는(은) " +num2+ " 의 약수입니다.");
			}else {
				System.out.println(num1+ " 는(은) " +num2+ " 의 약수가 아닙니다.");
			}
			
		}
		sc.close();

	}

}
