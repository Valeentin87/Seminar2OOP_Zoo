package org.example;

public class Fish extends Animal implements Floating,Cooking{
    public Fish(String nickName, int legNum, int age) {
        super(nickName, legNum, age);
    }

    @Override
    public String toString() {
        return "Рыбка"+super.toString();
    }

    @Override
    public String talkAnimal() {
        return "буль-буль";
    }

    @Override
    public int speedFloat() {
        return 6;
    }

    @Override
    public String cooked() {
        return "Рецепт вкусной жареной рыбы";
    }
}
