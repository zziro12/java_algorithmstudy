package algorithm_practice;

import java.util.*;
import java.io.*;
public class B_10871 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int key = sc.nextInt();
		
		int[] array = new int[num];
		
		for(int i = 0; i <num; i++) {
			array[i] = sc.nextInt();
		}
		
		for(int i = 0; i <num; i++) {
			if(array[i] < key) {
			System.out.print(array[i]+ " ");
			}
		}
	}
}