package lab6.ex4;

import java.util.HashMap;
import java.util.Map;

public class Lab6Ex4 {

	public static Map<Integer, String> getStudents(Map<Integer, Integer>map){
	
		Map<Integer, String> result = new HashMap<>();
		
		for(Map.Entry<Integer, Integer> e : map.entrySet()) {
			
			if(e.getValue()>=90) {
				result.put(e.getKey(), "Gold");
			}
			else if(e.getValue()>=80 && e.getValue()<90) {
				result.put(e.getKey(), "Silver");
			}
			else if(e.getValue()>=70 && e.getValue()<80) {
				result.put(e.getKey(), "Bronze");
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		Map<Integer, Integer> map = new HashMap<>();
		
		map.put(1, 75);
		map.put(5, 15);
		map.put(4, 95);
		map.put(3, 61);
		
		Map<Integer, String> result = getStudents(map);
		
		for(Map.Entry<Integer, String> e : result.entrySet()) {
			System.out.println(e.getKey()+ "  " + e.getValue());;
		}
	}
}
