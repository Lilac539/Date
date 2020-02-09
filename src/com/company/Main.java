package com.company;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the date in format dd.mm.yyyy");
        String userdate = scanner.next();
        int [] DateToInt = new int[3];
        int idOfMass = 3;
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(userdate);
        int start = 0;
        while (matcher.find(start)) {
            String value = userdate.substring(matcher.start(), matcher.end());
            int result = Integer.parseInt(value);
            DateToInt[DateToInt.length - idOfMass]= result;
            start = matcher.end();
            idOfMass--;
        }

        Calendar calendar = new GregorianCalendar(DateToInt[2], DateToInt[1] - 1,DateToInt[0]);
        SimpleDateFormat dateformat = new SimpleDateFormat("EEEE, d MMMM yyyy");
        System.out.println(dateformat.format(calendar.getTime()));
        if(((GregorianCalendar) calendar).isLeapYear(DateToInt[2])){
            System.out.println("Рік високосний");
        }
        else{
            System.out.println("Рік не високосний");
        }
        System.out.println(DateToInt);
    }
}
