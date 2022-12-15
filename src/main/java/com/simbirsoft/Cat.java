package com.simbirsoft;

public class Cat extends Animal {

    public Cat(double weight, int age, boolean ismail) {
        super(weight, age, ismail);
        this.voice = "Мяу";
        this.ageGroups = new String[]{"Котенок", "Кот побольше", "Вообще взрослый кот"};

    }

    protected void sleepAllDay(int currentHour) {
        if (currentHour == 11 || currentHour == 24) {
            System.out.println("Котик проснулся поесть");
        } else if (currentHour < 0 || currentHour > 24) {
            System.out.println("Время указанно не верно");
        } else {
            System.out.println("Котик спит");
        }

    }


}
