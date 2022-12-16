package org.example;

public class Wolf extends Animal implements Runable{

    public Wolf(String nickName, int legNum, int age) {
        super(nickName, legNum, age);
    }

    @Override
    public String talkAnimal() {
        return "Woooo";
    }

    @Override
    public String toString() {
        return "Волк"+super.toString();
    }

    @Override
    public int speedAnimal() {
        return 35;
    }
}
