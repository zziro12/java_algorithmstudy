package algorithm_practice;

import java.util.*;
public class Nsum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, sum =0;
		num = sc.nextInt();
		for(int i = 1; i <= num; i++ ) {
			sum = sum+i;
		}
		System.out.println(sum);
	}

}
