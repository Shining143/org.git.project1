package tests;

import java.util.Arrays;

public class Test4 {

	public static void main(String[] args) {
		
		int[] arr = {3,1,2,4,0,0,8,9};//
		System.out.println(Arrays.toString(shiftzeroRightside(arr)));

	}
	public static int[] shiftzeroRightside(int[] arr) {
		if(arr.length==1) {
			return arr;
		}
		int[] newArr = new int[arr.length];
		int count = 0;
		for(int number:arr) {
			if(number!=0) {
				newArr[count] = number;
				count++;
			}
		}
		return newArr;
	}

}
