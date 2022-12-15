package com.simbirsoft;

import java.util.Objects;

public class Cow extends Animal {
    String[] groups;

    public Cow(double weight, int age, boolean ismail) {
        super(weight, age, ismail);
        this.voice = "Му";
        this.ageGroups = new String[]{"Теленок", "Корова", "Старая корова"};
        this.maleAgeGroups = new String[]{"Теленок", "Бык", "Стараый бык"};
    }

    protected String definitionAgeGroup() {
        if (ismail) {
            groups = maleAgeGroups;
        } else {
            groups = ageGroups;
        }
        if (age <= 2) {
            ageGroup = groups[0];
        } else if (age < 15) {
            ageGroup = groups[1];
        } else {
            ageGroup = groups[2];
        }
        return ageGroup;
    }

    protected int giveMilkPerDay() {
        if (ismail) {
            return 0;
        }
        if (Objects.equals(definitionAgeGroup(), ageGroups[0])) {
            return 0;
        } else if (Objects.equals(definitionAgeGroup(), ageGroups[1])) {
            return 5;
        } else {
            return 2;
        }
    }

    protected void animalDescription() {
        if (name == null) {
            System.out.println(definitionAgeGroup() + " весом " + weight +
                    " дает " + giveMilkPerDay() + "л молока в день");
            return;
        }
        System.out.println(definitionAgeGroup() + " по кличке " + name + " весом " + weight +
                " дает " + giveMilkPerDay() + "л молока в день");
    }
}
