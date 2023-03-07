package com.charles.chapter14.poly_;

public class Food {
    private String name;

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class Fish extends Food {

        public Fish(String name) {
            super(name);
        }
    }

    public static class Rice extends Food{
        public Rice(String name) {
            super(name);
        }
    }

    public static class Bone extends Food{
        public Bone(String name) {
            super(name);
        }
    }
}
