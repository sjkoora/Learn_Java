package JvaSep;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

public class P {

	public static void main(String[] args) {
		int Year;
		int Month = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Year:");
		Year = scanner.nextInt();

		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Enter Month:");
		Year = scanner1.nextInt();
		
		YearMonth yearMonth = YearMonth.of(Year, Month);
		int dayInMonth = yearMonth.lengthOfMonth();
		int  mondayCount = 0;
		int daysInMonth = 30;
		for (int day = 1;day<= daysInMonth;day++) {
			LocalDate date = yearMonth.atDay(day);
			if(date.getDayOfWeek() == DayOfWeek.MONDAY) {
				mondayCount++;
			}
		}
		System.out.println("Number of Days in this MOnth: "+ dayInMonth);
//System.out.println("Number of Mondays in "  + yearMonth.getMonth() +" " + Year + ": " + mondayCount);
	}

}
