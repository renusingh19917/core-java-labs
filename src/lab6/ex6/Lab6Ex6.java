package lab6.ex6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab6Ex6 {

	public static List<Integer> votersList(Map<Integer, Integer> map){
	
		List<Integer> list  = new ArrayList<>();
		
		for(Map.Entry<Integer, Integer> e : map.entrySet()) {
			
			if(e.getValue()>18) {
				list.add(e.getKey());
			}
		}
		
		return list;
	}
	
	public static void main(String[] args) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		map.put(2, 22);
		map.put(4, 11);
		map.put(1, 7);
		map.put(10, 18);
		map.put(3, 35);
		map.put(6, 70);
		map.put(10, 86);
		
		List<Integer> list = Lab6Ex6.votersList(map);
		
		for(int i : list) {
			System.out.println(i);
		}
		
	}
}
