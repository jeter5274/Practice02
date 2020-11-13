package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		double height, weight, std_weight ;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("키와 몸무게를 입력해주세요");
		System.out.print("키 : ");
		height = sc.nextDouble();
		System.out.print("몸무게 : ");
		weight = sc.nextDouble();
		
		std_weight = (height - 100) * 0.9;
				
		if(std_weight < weight) {
			System.out.println("과체중 입니다");
		}else if(std_weight > weight){
			System.out.println("저체중 입니다.");
		}else{
			System.out.println("표준 입니다.");
		}
		System.out.println("표준체중 : " +std_weight);
		sc.close();
		
	}

}
