package lab2.ex4;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Lab2Ex4 {

	public static Integer[] modifyArray(int[] arr) {
	
		Set<Integer> set = new HashSet<>();
		
		Integer[] result = new Integer[set.size()];
		
		for(int i : arr)
			set.add(i);
		
		int in=0;
	
		for(int i : set) {
			result[in] = i;
			in++;
		}
		
		Arrays.sort(result, Collections.reverseOrder());
		
		return result;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {22, 54, 74,24,33,44, 22,44};
		
	    Integer[] result = modifyArray(arr);
		
		for(int i : result) {
			System.out.println(i);
		}
	}
}
