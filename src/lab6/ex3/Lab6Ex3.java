package lab6.ex3;

import java.util.HashMap;
import java.util.Map;

public class Lab6Ex3 {

	public static Map<Integer, Integer> getSquares(int[] array){
	
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<array.length; i++) {
			map.put(array[i], array[i]*array[i]);
		}
		
		return map;
	}
	
	public static void main(String[] args) {
		
		int[] array = {2,5,4,7,6,22};
		
		Map<Integer, Integer> map = Lab6Ex3.getSquares(array);
		
		for(Map.Entry<Integer, Integer> e : map.entrySet()) {
			System.out.println(e.getKey()+ "  " + e.getValue());
		}
	}
}
