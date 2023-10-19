package lab6.ex5;

import java.util.ArrayList;
import java.util.Collections;

public class Lab6Ex5 {

	public static int getSecondSmallest(int[] arr) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<arr.length; i++) {
			list.add(arr[i]);
		}
		
		Collections.sort(list);
		
		return list.get(1);
	}
	
	public static void main(String[] args) {
		
		int[] array = {4,66,21,43,65,11,2};
		
		int num = Lab6Ex5.getSecondSmallest(array);
		System.out.println(num);
	}
}

