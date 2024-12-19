
package JvaSep;

import java.time.Month;
import java.util.Scanner;

class MondayInMonth {

}

public class MonthlyCalender {

	public static void main(String[] args) {
		int Year;
		boolean isLeapYear = false;
		for (Month month : Month.values()) {

			int daysInMonth = month.length(isLeapYear);
			System.out.println(
					month.name().charAt(0) + month.name().substring(1).toLowerCase() + " has " + daysInMonth + "days.");
		}
		
		Mondays monday = new Mondays();
		System.out.println(monday.FourthWeek);

	}

}
