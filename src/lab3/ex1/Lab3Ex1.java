package lab3.ex1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Lab3Ex1 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a line of integers separated by spaces: ");
        
        String inputLine = scanner.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(inputLine);

        int sum = 0;

        while (tokenizer.hasMoreTokens()) {
        	
            String token = tokenizer.nextToken();
            
            int num = Integer.parseInt(token);
             System.out.println("Integer: " + num);
             sum += num;
          

        System.out.println("Sum of all integers: " + sum);
    }
}
}
