package com.company;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("If you want to know what was the day - input the date in format dd.mm.yyyy");
        String userdate = scanner.next();
        ShoZaDen date = new ShoZaDen();
        date.FindTheDay(userdate);

        System.out.println("If you want to know was that a LeapYear - input only the number of year");
        userdate = scanner.next();
        date.FindLeapYear(userdate);

        System.out.println("If you want to know what was the month - input the date in format dd.mm.yyyy");
        userdate = scanner.next();
        date.FindTheMonth(userdate);
    }
}
