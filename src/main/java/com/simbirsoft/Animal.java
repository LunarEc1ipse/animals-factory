package com.simbirsoft;

class Animal {

    private double weight;
    private String name;
    private String voice;
    private int age;
    private boolean ismail;
    protected String[] ageGroups;
    protected String[] maleAgeGroups;
    protected String ageGroup;
    protected String owner;

    protected Animal(double weight, int age, boolean ismail) {
        this.weight = weight;
        this.age = age;
        this.ismail = ismail;
    }

    public double getWeight() {
        return weight;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public boolean isIsmail() {
        return ismail;
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
            System.out.println(definitionAgeGroup() + " весом " + getWeight());
            return;
        }
        System.out.println(definitionAgeGroup() + " по имени " + getName() + " весом " + getWeight());
    }

}
