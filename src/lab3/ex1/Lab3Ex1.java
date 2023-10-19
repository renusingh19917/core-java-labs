//package lab3.ex1;
//
//import java.util.StringTokenizer;
//
//public class Lab3Ex1 {
//
//	public static void main(String[] args) {
//		
//		 String inputLine = "10 20 30 40 50";
//		 
//	        StringTokenizer tokenizer = new StringTokenizer(inputLine);
//
//	        int sum = 0;
//
//	        while (tokenizer.hasMoreTokens()) {
//	            String token = tokenizer.nextToken();
//	            try {
//	                int num = Integer.parseInt(token);
//	                sum += num;
//	                System.out.println("Integer: " + num);
//	            } catch (NumberFormatException e) {
//	                System.out.println("Invalid input: " + token);
//	            }
//	        }
//
//	        // Display the sum of the integers
//	        System.out.println("Sum of the integers: " + sum);
//	    }
//	}
//}
