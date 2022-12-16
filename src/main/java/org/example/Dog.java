package org.example;

public class Dog extends Animal implements Runable {
    public Dog(String nickName, int legNum, int age) {
        super(nickName, legNum, age);
    }

    @Override
    public String talkAnimal() {
        return "Wow";
    }

    @Override
    public String toString() {
        return "Собака"+super.toString();
    }

    @Override
    public int speedAnimal() {
        return 25;
    }
}
