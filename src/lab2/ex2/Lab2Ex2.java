package lab2.ex2;

import java.util.Arrays;
import java.util.Collections;


public class Lab2Ex2 {
	
	public static String[] sortStrings(String[] arr) {
		
		Arrays.sort(arr);
		
		String[] result = new String[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			
			    if(i<(arr.length/2)) {
			    
				result[i] = arr[i].toUpperCase();
			    }
			    else {
			    	result[i] = arr[i].toLowerCase();
			    }
		}
		
		if(arr.length %2 != 0) {
			result[(arr.length/2)] = arr[(arr.length/2)].toUpperCase();
		}
		
		return result;
		
	}

	public static void main(String[] args) {
		
		String[] arr = {"renu", "veenu" , "khushmeet", "sejal", "Aditya"};
		
		String[] result = sortStrings(arr);
		
		for(String a : result) {
			System.out.println(a);
		}
	}
}
