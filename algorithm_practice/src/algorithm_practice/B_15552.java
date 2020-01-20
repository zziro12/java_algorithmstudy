package algorithm_practice;

import java.util.*;
import java.io.*;

public class B_15552 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int time = Integer.parseInt(br.readLine());
		int[] Array = new int[time];
		
		for(int i = 0; i < time; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			Array[i] = a + b ;
		}
		
		for(int output : Array) {
			bw.write(String.valueOf(output));
			bw.newLine();
		}
		
		bw.flush();
	}

}
