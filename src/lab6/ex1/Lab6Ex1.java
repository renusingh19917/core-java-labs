package lab6.ex1;

import java.security.DomainCombiner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab6Ex1{

	public static ArrayList<Integer> sort(Map<Integer, Integer> map){
		
		ArrayList<Integer> li = new ArrayList<>();
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			li.add(entry.getValue());
		}
		
		Collections.sort(li);
		
		return li;
	}
	
	public static void main(String[] args) {
		
		Map<Integer, Integer> map = new HashMap<>();
		
		map.put(1, 20);
		map.put(2, 15);
		map.put(3, 5);
		map.put(4, 35);
		
		
		ArrayList<Integer> list = Lab6Ex1.sort(map);
		
		System.out.println(list);
	}
}
