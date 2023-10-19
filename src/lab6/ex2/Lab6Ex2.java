package lab6.ex2;

import java.util.HashMap;
import java.util.Map;

public class Lab6Ex2 {

	public static Map<Character, Integer> countCharacters(char[] arr) {
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0; i<arr.length; i++) {
			
			if(map.containsKey(arr[i]))
			map.put(arr[i], map.get(arr[i])+1);
			else
				map.put(arr[i], 1);
		}
		
		return map;
	}
	
	public static void main(String[] args) {
		
		char[] array = {'a', 'b', 'g', 'a', '1', '4','a','g','g'};
		
		Map<Character, Integer> map = Lab6Ex2.countCharacters(array);
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+ "  " + entry.getValue());
		}
	}
}
