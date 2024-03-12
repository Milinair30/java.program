import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;

public class WeekDayExample {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();
        LocalDate date = LocalDate.parse(inputDate, DateTimeFormatter.ISO_LOCAL_DATE);

        DayOfWeek dayOfWeek = date.getDayOfWeek();

        // Get the name of the day
        String dayName = dayOfWeek.toString();
        System.out.println("Day of the week for " + inputDate + " is: " + dayName);

        
        scanner.close();
    }
}


