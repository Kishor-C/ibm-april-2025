package com.ibm;

public class MCQ1 {
	public static void main(String[] args) {
		int items[] = {1, 2, 3, 4, 3, 6, 8, 9, 7, 9, 6, 7};
		int first3 = -1;
		int last7 = -1;
		for(int index = 0; index < items.length; index++) {
			if(items[index] == 3) {
				first3 = index;
				break;
			}
		}
		for(int index = items.length - 1; index >= 0; index--) {
			if(items[index] == 7) {
				last7 = index;
				break;
			}
		}
		System.out.println(first3 != -1 ? ("1st occurence of 3 is found at "+first3) : ("3 is not found"));
		System.out.println(last7 != -1 ? ("last occurence of 7 is found at "+last7) : ("7 is not found"));
	}
}