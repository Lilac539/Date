package com.company;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ShoZaDen {
    public void FindTheDay(String date) {

        int [] chekdate = ParseTheDate(date);
        Calendar calendar = new GregorianCalendar(chekdate[2], chekdate[1] - 1, chekdate[0]);
        //SimpleDateFormat dateformat = new SimpleDateFormat("EEEE, d MMMM yyyy");
        SimpleDateFormat dateformat = new SimpleDateFormat("EEEE");
        System.out.println(dateformat.format(calendar.getTime()));
    }
        public void FindLeapYear(String year){
            Calendar cal = new GregorianCalendar();
            if (((GregorianCalendar) cal).isLeapYear(Integer.parseInt(year))) {
                System.out.println("Рік високосний");
            } else {
                System.out.println("Рік не високосний");
            }
        }

        public int[] ParseTheDate (String date){
            int[] dateToInt = new int[3];
            int idOfMass = 3;
            Pattern pattern = Pattern.compile("\\d+");
            Matcher matcher = pattern.matcher(date);
            int start = 0;
            while (matcher.find(start)) {
                String value = date.substring(matcher.start(), matcher.end());
                int result = Integer.parseInt(value);
                dateToInt[dateToInt.length - idOfMass] = result;
                start = matcher.end();
                idOfMass--;
            }
            return dateToInt;
        }

        public void FindTheMonth (String month){
            int [] chekmonth = ParseTheDate(month);
            Calendar calendar = new GregorianCalendar(chekmonth[2], chekmonth[1] - 1, chekmonth[0]);
            SimpleDateFormat dateFormat = new SimpleDateFormat("d MMMM");
            System.out.println(dateFormat.format(calendar.getTime()));
        }


}
