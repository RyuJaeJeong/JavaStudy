package chap04;

import java.util.Arrays;

public class Test03 {
	public static void main(String[] args) {
		String [] wishList = {"냉장고", "선풍기", "tv", "노트북", "세탁기", "에어컨"};
		String [] purchasedList = {"노트북", "tv", "에어컨"};
		
		Arrays.sort(purchasedList);
		
		System.out.printf("%s", Arrays.binarySearch(purchasedList, wishList[0])<0?wishList[0]+"\n":"");
		System.out.printf("%s", Arrays.binarySearch(purchasedList, wishList[1])<0?wishList[1]+"\n":"");
		System.out.printf("%s", Arrays.binarySearch(purchasedList, wishList[2])<0?wishList[2]+"\n":"");
		System.out.printf("%s", Arrays.binarySearch(purchasedList, wishList[3])<0?wishList[3]+"\n":"");
		System.out.printf("%s", Arrays.binarySearch(purchasedList, wishList[4])<0?wishList[4]+"\n":"");
		System.out.printf("%s", Arrays.binarySearch(purchasedList, wishList[5])<0?wishList[5]+"\n":"");
	
	}
}
