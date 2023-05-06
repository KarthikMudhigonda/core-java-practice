package arrays;

public class DaysInWeek {
    public static void main(String[] args) {
        // Created a string with varibale name as daysInWeek
        String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
//Empty string to 
        String dayWithMostCharcters = "";

        for (String day : daysOfWeek) {
            if (day.length() > dayWithMostCharcters.length()) {
                dayWithMostCharcters = day;
            }
        }
        System.out.println("Day with most characters: " + dayWithMostCharcters);

        for (int i = daysOfWeek.length - 1; i >= 0; --i) {
            System.out.println(daysOfWeek[i]);
        }
    }
}
