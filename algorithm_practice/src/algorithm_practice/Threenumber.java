package algorithm_practice;

import java.util.*;
public class Threenumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if((a>=b && a<=c) || (a<=b && a>=c)) {
			System.out.println(a);
		}else if((b>=a && b<=c) || (b<=a && b>=c)) {
			System.out.println(b);
		}else if((c>=a && c<=b) || (c<=a && c>=b)){
			System.out.println(c);
		}
	}
}
