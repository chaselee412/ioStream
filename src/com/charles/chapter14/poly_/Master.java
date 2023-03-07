package com.charles.chapter14.poly_;

public class Master {
    private String name;
    public Master(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void feed(Animal animal, Food food){
        System.out.println("master "+name+" is feeding "+animal.getName()+" with "+food.getName());
    }
}
