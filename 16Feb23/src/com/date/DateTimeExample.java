package com.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeExample {

	public static void main(String[] args) {
		/*
		 * Display Current Time
		 */
		LocalDate currentTime = LocalDate.now();
		System.out.println(currentTime);
		/*
		 * Display Current Date and Time
		 */
		Month month = currentTime.getMonth();
		int day = currentTime.getDayOfMonth();

		System.out.println("Month: " + month + "day: " + day);
		System.out.println(LocalDateTime.now());
		/*
		 * Formatting Date and Time
		 */
		LocalDateTime myDateObj = LocalDateTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
		System.out.println(myDateObj.format(myFormatObj));
		/*
		 * snippet gets the current local date and adds one day:
		 */
		LocalDate tomorrow = LocalDate.now().plusDays(1);
		System.out.println(tomorrow);

		LocalDate currDate = LocalDate.now();
		LocalDate date1 = currDate.plus(5, ChronoUnit.MONTHS);
		LocalDate date2 = currDate.minus(5, ChronoUnit.DAYS);

		System.out.println("Current Date: " + currDate);
		System.out.println("Current Date plus five months: " + date1);
		System.out.println("Current Date minus five days: " + date2);
		System.out.println("Length of Month: " + currDate.lengthOfMonth());
		System.out.println("Length of Year: " + currDate.lengthOfYear());
		System.out.println(currDate.isLeapYear());
		
		

	}
}
