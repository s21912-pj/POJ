package com.zjazd2;
/*
    Human model
    Author: Karol K   
 */
//for shorter syntax we could use lombok and two adnotations to generate constructor and getter and setter.
public class Human {
    private int age;
    private float weight;
    private float height;
    private boolean isMale;
    private int indexNumber;
    private float feetSize;
    private String name;

    public Human(int age, float weight, float height, boolean isMale, int indexNumber, float feetSize, String name) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.isMale = isMale;
        this.indexNumber = indexNumber;
        this.feetSize = feetSize;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }

    public float getFeetSize() {
        return feetSize;
    }

    public void setFeetSize(float feetSize) {
        this.feetSize = feetSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Human{");
        sb.append("age=").append(age);
        sb.append(", weight=").append(weight);
        sb.append(", height=").append(height);
        sb.append(", isMale=").append(isMale);
        sb.append(", indexNumber=").append(indexNumber);
        sb.append(", feetSize=").append(feetSize);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        Human humanModel = new Human(29, 92, 189, true,
                                    21912, 45, "Karol");
        System.out.println(humanModel.toString());
    }
}
