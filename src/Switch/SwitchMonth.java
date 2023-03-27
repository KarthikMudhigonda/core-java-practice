package Switch;

public class SwitchMonth {
    public static void main(String[] args) {
        int month = 4;
        String monthString = "";

        switch(month){
            case 1: monthString = "1 = January";
            break;
            case 2:monthString = "2 = Feb";
            break;
            case 3: monthString = "3 = Mar";
            break;
            case 4: monthString = "4 = Apr";
            break;
            default: System.out.println("Invalid month");
        }
System.out.println(monthString);
    }
    
}
