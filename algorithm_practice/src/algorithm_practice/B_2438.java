package algorithm_practice;

import java.util.*;
public class B_2438 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n<1 || n>100) {
			System.exit(0);
			
		}
		for(int i = 0;i<n;i++) {
			for(int j =0; j<=i; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
	}
}