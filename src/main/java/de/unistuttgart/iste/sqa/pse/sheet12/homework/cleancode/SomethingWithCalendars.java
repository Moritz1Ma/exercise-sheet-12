package de.unistuttgart.iste.sqa.pse.sheet12.homework.cleancode;

import static java.lang.Integer.parseInt;

import java.util.Calendar;
import java.util.Scanner;

public class SomethingWithCalendars {

	static String[] weekDays = new String[] {"Sunday", "Monday", "Tuesday", "Wednesday",
			"Thursday", "Friday", "Saturday"};

	static void setCalendarDate(final Calendar cal, final String date, final String sep) {
		final String[] splitDate = date.split(sep);
		cal.set(parseInt(splitDate[0]), parseInt(splitDate[1]) - 1, parseInt(splitDate[2]));
	}

	public static void main(final String[] args) {
		final Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input for SomethingWithCalendars: (press enter to confirm)");
		final String input = scanner.nextLine();
		final Calendar calendar = Calendar.getInstance();
		if (input.contains("-")) {
			setCalendarDate(calendar, input, "-");
		} else if (input.contains("/")) {
			setCalendarDate(calendar, input, "/");
		} else if (input.contains(".")) {
			setCalendarDate(calendar, input, "\\.");
		}
		final int weekday = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.printf("%s\n", weekDays[weekday - 1]);
	}
}
