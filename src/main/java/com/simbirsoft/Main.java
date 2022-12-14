package com.simbirsoft;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class Main {
    static Date date = Calendar.getInstance().getTime();
    static DateFormat dateFormat = new SimpleDateFormat("hh");



    public static void main(String[] args) {

        Cat cat =new Cat(3,5);
        int currentHour = Integer.parseInt(dateFormat.format(date));

        cat.definitionAgeGroup();
        System.out.println(cat.definitionAgeGroup());
        cat.saySomething();
        cat.sleepAllDay(currentHour);


    }
}
