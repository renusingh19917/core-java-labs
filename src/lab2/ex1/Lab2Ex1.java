package lab2.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lab2Ex1 {

		public static int getSecondSmallest(Integer[] array) {
			List<Integer> list = new ArrayList<>(Arrays.asList(array));
			Collections.sort(list);
			int size = list.size();
			int ss = list.get(size - 2);
			return ss;
		}

		public static void main(String[] args) {
			Integer[] arr = { 14, 21, 63, 44, 57, 29 };
			int ans = getSecondSmallest(arr);
			System.out.println(ans);
		}

}
