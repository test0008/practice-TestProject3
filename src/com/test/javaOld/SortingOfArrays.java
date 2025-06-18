package com.test.javaOld;

public class SortingOfArrays {

	public static void main(String[] args) {
		int[] arr = {5,12,8,45,9,66,3,7,23,100};
		printArray(arr, "Old Data");
		printArray(sotIntArray(arr), "\nNew Data");

	}

	private static int[] sotIntArray(int[] arr) {
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
			}
		}
		return arr;
	}

	private static void printArray(int[] arr, String msg) {
		System.out.print(msg+" : {");
		for (int i = 1; i<arr.length; i++){
			if(i>1)
				System.out.print(", ");
			System.out.print(arr[i]);
		}
		System.out.print("}");
	}

}
