package com.simbirsoft;

class Animal {

    double weight;
    String name;
    String voice;
    int age;
    String[] ageGroups;
    String[] maleAgeGroups;
    String ageGroup;
    boolean ismail;
    String owner;

    protected Animal(double weight, int age, boolean ismail) {
        this.weight = weight;
        this.age = age;
        this.ismail = ismail;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void saySomething() {
        System.out.println(voice);

    }

    protected String definitionAgeGroup() {
        if (age <= 1) {
            ageGroup = ageGroups[0];
        } else if (age < 8) {
            ageGroup = ageGroups[1];
        } else {
            ageGroup = ageGroups[2];
        }
        return ageGroup;
    }

    protected void animalDescription() {
        if (name == null) {
            System.out.println(definitionAgeGroup() + " весом " + weight);
            return;
        }
        System.out.println(definitionAgeGroup() + " по имени " + name + " весом " + weight);
    }

}
