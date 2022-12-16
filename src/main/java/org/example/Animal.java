package org.example;

public abstract class Animal {
    private String nickName;
    private int legNum;
    private int age;

    public Animal(String nickName, int legNum, int age) {
        this.nickName = nickName;
        this.legNum = legNum;
        this.age = age;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getNickName() {
        return nickName;
    }

    public int getLegNum() {
        return legNum;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format(" кличка: %s, количество лап: %d, возраст: %d лет",nickName,legNum,age);
    }


    public abstract String talkAnimal();
}
