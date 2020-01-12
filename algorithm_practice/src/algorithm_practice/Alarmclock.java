package algorithm_practice;

import java.util.*;
public class Alarmclock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour, minute;
		hour = sc.nextInt();
		minute = sc.nextInt();
		//0<=hour<=23, 0<=minute<=59
		
		if(minute >=45) {
			System.out.println(hour + " " + (minute - 45));
		}else if(minute < 45){
			if(hour - 1< 0) {
				hour = 24;
			}
			
			System.out.println(hour-1 + " " + (60 - (45-minute)));
		}
	}
}
