package com.simbirsoft;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    static Date date = Calendar.getInstance().getTime();
    static DateFormat dateFormat = new SimpleDateFormat("hh");


    public static void main(String[] args) {

        Cat cat = new Cat(3, 5, true);
        Cow cow = new Cow(100, 5, false);
        Human human = new Human(70, 20, true, "Петя");
        Human human1 = new Human(50, 20, false, "Лена");
        int currentHour = Integer.parseInt(dateFormat.format(date));

        cat.definitionAgeGroup();
        System.out.println(cat.definitionAgeGroup());
        cat.saySomething();
        cat.sleepAllDay(currentHour);
        cat.animalDescription();
        cow.animalDescription();
        human.buyAnimal(human1, "Вася").animalDescription();

        System.out.println(cat.owner);


    }
}
