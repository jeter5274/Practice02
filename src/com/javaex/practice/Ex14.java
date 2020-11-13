package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		double profit;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("수익을 입력해 주세요(단위 : 만원)");
		System.out.print("금익 : ");
		profit = sc.nextDouble();
		
		if(profit < 0) {
			System.out.println("잘못 입력했습니다.");
		}else if(profit <= 1000){
			System.out.println("소득세는 " +(profit*0.09)+" 입니다.");
		}else if(profit <= 4000){
			System.out.println("소득세는 " + (1000 * 0.09 + 0.18 * (profit - 1000))+" 입니다.");
		}else if(profit < 8000){
			System.out.println("소득세는 " +(1000 * 0.09 + 3000 * 0.18 + 0.27 * (profit - 4000))+" 입니다.");
		}else {
			System.out.println("소득세는 " +(1000 * 0.09 +  3000 * 0.18 + 4000 * 0.27 + 0.36 * (profit - 8000))+" 입니다.");
		}
		
		sc.close();

	}

}
