package com.charles.chapter14.poly_;

public class Poly01 {
    public static void main(String[] args) {
        Master tom =new Master("tom");
        Animal.Dog cara = new Animal.Dog("cara");
        Food.Bone bone = new Food.Bone("shit bone");
        tom.feed(cara,bone);
        Animal.Cat yaYa = new Animal.Cat("YaYa");
        Food.Fish fish = new Food.Fish("Salmon");
        System.out.println("====================");
        tom.feed(yaYa, fish);
    }
}
