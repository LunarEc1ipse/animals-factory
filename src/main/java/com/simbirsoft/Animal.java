package com.simbirsoft;
class Animal {

    double weight;
    String name;
    String voice;
    int age;
    String[] ageGroups;
    String ageGroup;

    protected Animal(double weight, int age) {
        this.weight = weight;
        this.age = age;
    }

    protected double getWeight() {
        return weight;
    }

    protected String getName() {
        return name;
    }

    protected int getAge() {
        return age;
    }

    protected void setWeight(double weight) {
        this.weight = weight;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    protected void saySomething(){
        System.out.println(voice);

    }

    protected String definitionAgeGroup(){
        if (age <= 1){
            ageGroup =  ageGroups[0];
        } else if(age > 1 && age < 8) {
            ageGroup =  ageGroups[1];
        } else {
            ageGroup =  ageGroups[2];
        }
        return ageGroup;
    }

    protected void animalDescription(){
        if (name ==  null) {
            System.out.println(ageGroup + " весом " + weight);
            return;
        }
        System.out.println(ageGroup + " по кличке " + name + " весом " + weight);
    }

}
