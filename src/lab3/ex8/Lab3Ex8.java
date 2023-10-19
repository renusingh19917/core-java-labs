package lab3.ex8;

public class Lab3Ex8 {

	public static boolean positiveString(String str) {
	
        for(int i=1; i<str.length(); i++) {
			
			char currChar = str.charAt(i);
			char prevChar = str.charAt(i-1);
			
			if(currChar < prevChar)
				return false;
		}	
        
        return true;
        
	}

	public static void main(String[] args) {

		String str = "ant";
   
		System.out.println(positiveString(str));
	}
}
