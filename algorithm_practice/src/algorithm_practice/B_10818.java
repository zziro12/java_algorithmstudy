package algorithm_practice;

import java.io.*;
import java.util.*;

public class B_10818 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		int max = -1000000;
		int min = 1000000;
		
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i =0; i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		bw.write(min + " " + max);
		bw.flush();
		bw.close();
		
	}
}