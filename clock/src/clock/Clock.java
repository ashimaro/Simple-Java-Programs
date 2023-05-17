
package clock;

/**
 *
 * @author User
 */

import java.util.TimeZone;
public class Clock {
public static void main(String[] args) {
    
        // Outer loop for hours
        for (int hour = 0; hour < 24; hour++) {
            // Inner loop for minutes
            for (int minute = 0; minute < 60; minute++) {
                // Innermost loop for seconds
                for (int second = 0; second < 60; second++) {
                    // Display the current time
                    System.out.printf("%02d:%02d:%02d%n", hour, minute, second);

                    // Pause for one second
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
