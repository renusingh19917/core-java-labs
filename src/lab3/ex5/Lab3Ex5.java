package lab3.ex5;

import java.util.Scanner;

public class Lab3Ex5 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a text (type '.' on a new line to finish):");

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        while (true) {
            String line = scanner.nextLine();

            if (line.equals(".")) {
                break;
            }

            charCount += line.length();
            String[] words = line.split("\\s+"); // Split the line into words
            wordCount += words.length;
            lineCount++;
        }

        System.out.println("Character count: " + charCount);
        System.out.println("Word count: " + wordCount);
        System.out.println("Line count: " + lineCount);
    }
}
