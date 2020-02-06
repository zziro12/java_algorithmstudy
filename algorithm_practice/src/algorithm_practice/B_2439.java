package algorithm_practice;

import java.util.*;
public class B_2439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n<1 || n>100) {
			System.exit(0);
			
		}
		for(int i = 1; i <= n; i++) {
			for(int j = i ; j <=n-1;j++) {
				System.out.print(" ");
			}
			for(int j = n-i; j <n; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}