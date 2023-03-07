package com.charles.chapter14.poly_;

public class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class Cat extends Animal{

        public Cat(String name) {
            super(name);
        }
    }

    public static class Dog extends Animal {

        public Dog(String name) {
            super(name);
        }
    }

    public static class Pig extends Animal{
        public Pig(String name) {
            super(name);
        }
    }
}
