package de.unistuttgart.iste.sqa.pse.sheet12.homework.cleancode;

import static java.lang.Integer.parseInt;

import java.util.Calendar;
import java.util.Scanner;

public class SomethingWithCalendars {
    static String[] weekDays = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input for SomethingWithCalendars: (press enter to confirm)");
        final String input = scanner.nextLine();
        final Calendar calendar = Calendar.getInstance();
        final String separator = getSeparator(input);
        if (separator != null) {
            setCalendarDate(calendar, input, separator);
        }
        final int weekday = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.printf(weekDays[weekday - 1]);
    }

    /**
     * Gets the seperators of the date, returns null if no seperator can be found.
     *
     * @param input the input given my the user;
     * @return the seperator or null, if no seperator is found;
     */
    private static String getSeparator(final String input) {
        if (input.contains("-")) {
            return "-";
        } else if (input.contains("/")) {
            return "/";
        } else if (input.contains(".")) {
            return "//.";
        }
        return null;
    }

    /**
     * Sets a new calendar date for the calendar;
     *
     * @param calendar  the calendar;
     * @param date      the date;
     * @param separator the separator separating the numbers of the date from each other;
     */
    static void setCalendarDate(final Calendar calendar, final String date, final String separator) {
        final String[] finalDate = date.split(separator);
        calendar.set(parseInt(finalDate[0]), parseInt(finalDate[1]) - 1, parseInt(finalDate[2]));
    }
}
