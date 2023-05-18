
package agecalculator;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author Ashi
 */
public class AgeCalculator {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your birthday in format of (YYYY-MM-DD)");
        String birthInput =input.nextLine();
        LocalDate start_Local_date = LocalDate.parse(birthInput);
        LocalDate end_Local_date = LocalDate.now();

        long years = ChronoUnit.YEARS.between(start_Local_date, end_Local_date);
        System.out.println("Your age now: "+years + "years old");

        Period period_Between = Period.between(start_Local_date, end_Local_date);
        System.out.println("Age in years/months/dates: "+period_Between.getYears() + "y "
                + period_Between.getMonths() + "m "
                + period_Between.getDays() + "d");
    }
}

/**
 *In Java, ChronoUnit and Period are classes in the java.time package that provide functionality for working with dates and times.
 *ChronoUnit is an enum
 *Period represents a period of time 
 */