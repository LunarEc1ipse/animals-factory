package com.simbirsoft;

import java.util.Objects;

public class Cow extends Animal {
    String[] groups;

    public Cow(double weight, int age, boolean ismail) {
        super(weight, age, ismail);
        this.setVoice("Му");
        this.ageGroups = new String[]{"Теленок", "Корова", "Старая корова"};
        this.maleAgeGroups = new String[]{"Теленок", "Бык", "Стараый бык"};
    }

    @Override
    protected String definitionAgeGroup() {
        if (isIsmail()) {
            groups = maleAgeGroups;
        } else {
            groups = ageGroups;
        }
        if (getAge() <= 2) {
            ageGroup = groups[0];
        } else if (getAge() < 15) {
            ageGroup = groups[1];
        } else {
            ageGroup = groups[2];
        }
        return ageGroup;
    }

    protected int giveMilkPerDay() {
        if (isIsmail()) {
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

    @Override
    protected void animalDescription() {
        if (getName() == null) {
            System.out.println(definitionAgeGroup() + " весом " + getWeight() +
                    " дает " + giveMilkPerDay() + "л молока в день");
            return;
        }
        System.out.println(definitionAgeGroup() + " по кличке " + getName() + " весом " + getWeight() +
                " дает " + giveMilkPerDay() + "л молока в день");
    }
}
