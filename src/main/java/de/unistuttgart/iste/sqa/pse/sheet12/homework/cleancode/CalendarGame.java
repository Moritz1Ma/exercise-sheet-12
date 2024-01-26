package de.unistuttgart.iste.sqa.pse.sheet12.homework.cleancode;

import static java.lang.Integer.parseInt;

import java.util.Calendar;
import java.util.Scanner;


public class CalendarGame {
    /**
     * This class allows a user interaction by letting the user write a date and returns the day of the date provided by the
     * user in the terminal.
     *
     * @author Moritz Mairle, Quentin Hadar, Nora Jasharaj
     */
    static String[] weekDays = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};


    public static void main(final String[] args) {
        final String input = getUserInput();
        final Calendar calendar = Calendar.getInstance();
        final String separator = getSeparator(input);
        if (separator != null) {
            setCalendarDate(calendar, input, separator);
        }
        final int weekday = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.printf(weekDays[weekday - 1]);
    }

    /**
     * Gets the input provided by the user;
     *
     * @return the input by the user;
     */
    private static String getUserInput() {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input for SomethingWithCalendars: (press enter to confirm)%n");
        return scanner.nextLine();
    }


    /*@
      @requires input !==null;
      @ensures either null or the separator is being returned;
     */

    /**
     * Gets the separators of the date, returns null if no separator can be found.
     *
     * @param input the input given my the user;
     * @return the separator or null, if no separator is found;
     */
    private static String getSeparator(final String input) {
        assert !(input == null);
        if (input.contains("-")) {
            return "-";
        } else if (input.contains("/")) {
            return "/";
        } else if (input.contains(".")) {
            return "//.";
        }
        return null;
    }

    /*@
      @requires calendar!== null;
      @requires date !== null;
      @requires separator!==null;
      @ensures new calendarDate;
     */

    /**
     * Sets a new calendar date for the calendar;
     *
     * @param calendar  the calendar;
     * @param date      the date;
     * @param separator the separator separating the numbers of the date from each other;
     * @throws NumberFormatException if the date format is invalid;
     */
    public static void setCalendarDate(final Calendar calendar, final String date, final String separator) {
        final String[] finalDate = date.split(separator);
        try {
            calendar.set(Integer.parseInt(finalDate[0]), Integer.parseInt(finalDate[1]) - 1, Integer.parseInt(finalDate[2]));
        } catch (NumberFormatException exception) {
            System.out.println("Invalid date provided. Please enter a valid date.");
        }
    }

}


