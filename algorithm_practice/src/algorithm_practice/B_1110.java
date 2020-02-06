package algorithm_practice;

import java.util.*;
public class B_1110 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		if(n<0 || n>99) {
			System.out.println("0보다 크거나 같고,99보다 작거나 같은 정수를 입력해주세요.");
			System.exit(0);
		}
		sc.close();
		
		int num = n;
		int count =0;
		
		do {
			num = ((num % 10) * 10) + (((num / 10) + (num % 10)) % 10);
			count++;
		} while(n!=num);
		
		System.out.println(count);
		
	}
}