package lab2.ex3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lab2Ex3 {

	public static int[] getSorted(int[] arr) {
		String[] st = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			st[i] = String.valueOf(arr[i]);
		}

		List<String> list = Arrays.asList(st);
		Collections.reverse(list);

		System.out.println("Reversed Array: " + list);

		Arrays.sort(arr);
		return arr;
	}

	public static void main(String[] args) {
		int[] array = { 123, 456, 789, 987, 654 };
		int[] ans = getSorted(array);

		System.out.println("Sorted Array: " + Arrays.toString(ans));
	}	
}
