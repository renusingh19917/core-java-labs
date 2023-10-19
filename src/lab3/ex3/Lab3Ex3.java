package lab3.ex3;

public class Lab3Ex3 {

	public static String alterString(String s) {
		
		String result = "";
		
		for(int i=0 ;i<s.length(); i++) {
			
			if(s.charAt(i)!= 'a' && s.charAt(i)!= 'e' && s.charAt(i)!= 'i' && s.charAt(i)!= 'o' &&
					s.charAt(i)!= 'u' && s.charAt(i)!= 'A' && s.charAt(i)!= 'E' && s.charAt(i)!= 'I' && s.charAt(i)!= 'O' &&
					s.charAt(i)!= 'U') {
				
				result += (char)(s.charAt(i)+1);
				
			}
			else
				result+= s.charAt(i);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		String s = "Renu Singh";
		
		System.out.println(alterString(s));
	}
}
