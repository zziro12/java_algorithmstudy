package algorithm_practice;

import java.util.*;
public class Multi3x3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a ,b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println(a * (b%10));
		System.out.println(a * ((b%100)/10) );
		System.out.println(a * (b/100));
		System.out.println(a * b);

	}
}
