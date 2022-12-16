package org.example;

public class Сock extends Animal implements Runable,Cooking {
    @Override
    public String talkAnimal() {
        return "Ku-ka-re-ku";
    }

    public Сock(String nickName, int legNum, int age) {
        super(nickName, legNum, age);
    }

    @Override
    public String toString() {
        return "Петух "+super.toString();
    }

    @Override
    public int speedAnimal() {
        return 10;
    }

    @Override
    public String cooked() {
        return "Рецепт вкусного жареного петуха";
    }
}
