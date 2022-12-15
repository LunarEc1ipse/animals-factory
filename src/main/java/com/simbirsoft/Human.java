package com.simbirsoft;

public class Human extends Animal {

    protected Human(double weight, int age, boolean ismail, String name) {
        super(weight, age, ismail);
        this.setName(name);
        this.ageGroups = new String[]{"Ребенок", "Взрослый", "Пожилой"};
    }

    @Override
    protected String definitionAgeGroup() {
        if (getAge() <= 18) {
            ageGroup = ageGroups[0];
        } else if (getAge() < 60) {
            ageGroup = ageGroups[1];
        } else {
            ageGroup = ageGroups[2];
        }
        return ageGroup;
    }

    public Animal buyAnimal(Animal animal, String name) {
        try {
            if (animal instanceof Human) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Exception caught. Покупать людей запрещено.");
            System.exit(0);
        }
        animal.setName(name);
        animal.owner = this.getName();
        return animal;
    }

}
