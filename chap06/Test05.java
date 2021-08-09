package chap06;

import java.util.Arrays;
import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String temp = "";
		String result = "";
		while(true) {
			System.out.println("문자열 입력");
			temp = sc.nextLine();
			temp = temp.toLowerCase();
			char[] temps = temp.toCharArray();		
			System.out.println(Arrays.toString(temps));
			for (int i = 0; i < temps.length; i++) {
				if(temps[i] == ' ') {	
					char imsi =  temps[i+1];
					imsi = (char)((int)imsi-32);
					temps[i+1] = imsi;
				}
				result += temps[i];
			}
			System.out.println(result.replaceAll(" ", ""));
		}
	}
}
