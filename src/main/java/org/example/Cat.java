package org.example;

public class Cat extends Animal implements Runable {

    public Cat(String nickName, int legNum, int age) {
        super(nickName, legNum, age);
    }

    @Override
    public String talkAnimal() {
        return "Mey";
    }

    @Override
    public String toString() {
        return "Кошка"+super.toString();
    }

    @Override
    public int speedAnimal() {
        return 15;
    }
}
