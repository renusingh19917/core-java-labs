package lab3.ex4;

public class Lab3Ex4 {

	public static int modifyNumber(int num) {
		
		String numStr = String.valueOf(num);
		
		String result = "";
		
		for(int i=0; i<numStr.length()-1; i++) {
			
			int digit1 = numStr.charAt(i) - '0';
			int digit2 = numStr.charAt(i+1) - '0';
			
			int diff = Math.abs(digit1 - digit2);
			
			String diffChar = String.valueOf(diff);
			
			result+= diffChar;
			
		}
		
		result+= numStr.charAt(numStr.length()-1);
		
		return Integer.parseInt(result);
	}
	
	public static void main(String[] args) {
		
		int num = 123456;
		
		int result = modifyNumber(num);
		
		System.out.println(result);
	}
	
    
	
}
