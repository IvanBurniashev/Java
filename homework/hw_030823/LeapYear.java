package homework.hw_030823;

import java.util.Scanner;

public class LeapYear {
    private int year;
    Scanner scan = new Scanner(System.in);
    
    protected Boolean runLeapYear(int year) {
        this.year = year;
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }
}
