package lab3.ex9;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Lab3Ex9 {
	
	 public static int calculateYears(LocalDate startDate, LocalDate endDate) {
	        return endDate.getYear() - startDate.getYear();
	    }

	    public static int calculateMonths(LocalDate startDate, LocalDate endDate) {
	        int years = calculateYears(startDate, endDate);
	        int months = endDate.getMonthValue() - startDate.getMonthValue();

	        if (months < 0) {
	            months += 12;
	            years--;
	        }

	        return years * 12 + months;
	    }

	    public static int calculateDays(LocalDate startDate, LocalDate endDate) {
	        return (int) startDate.until(endDate).getDays();
	    }

	public static void main(String[] args) {
       
        String date = "2022-09-19";

        LocalDate inputDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate currentDate = LocalDate.now();

        int years = calculateYears(inputDate, currentDate);
        int months = calculateMonths(inputDate, currentDate);
        int days = calculateDays(inputDate, currentDate);

        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Days: " + days);
    }

   
}
