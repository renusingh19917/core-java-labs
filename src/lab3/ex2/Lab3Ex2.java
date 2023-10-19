package lab3.ex2;

public class Lab3Ex2 {

	public static String getImage(String s) {
	
		 StringBuffer string = new StringBuffer(s);
		 string.reverse();
		 
		 return s + " | " + string;
	}
	
	public static void main(String[] args) {
		
		String given = "Renu Singh";
		
		String result = getImage(given);
		
		System.out.println(result);
	}
}
