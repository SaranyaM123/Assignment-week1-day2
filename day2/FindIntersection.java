package week1.day2;

import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {
		int[] array1= {3,2,11,4,6,7};
		int length = array1.length;
		Arrays.sort(array1);
		System.out.println("size of the array1:" +length);
		
		int[] array2 = {1,2,8,4,9,7};
		int length2 = array2.length;
		Arrays.sort(array2);
		System.out.println("size of the array2:" +length2);
		
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if(array1[i]==array2[j]) {
					System.out.println("Intersection of array1 and array2 is:"+array1[i]);
				}
				
			}
		}
		
		
		
		
	}

}
