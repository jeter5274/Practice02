package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		int employeeNo;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("사번(정수)를 입력해주세요");
		System.out.print("사번 : ");
		employeeNo = sc.nextInt();
		
		if(employeeNo >= 0) {
			switch (employeeNo % 3) {
			default :
				System.out.println("A팀입니다");
				break;
			case 1 :
				System.out.println("B팀입니다");
				break;
			case 2 :
				System.out.println("C팀입니다");
				break;
			}
		}else {
			System.out.println("잘못입력하셨습니다.");
		}
		sc.close();
	}

}
