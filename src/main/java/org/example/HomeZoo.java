package org.example;

import java.util.ArrayList;
import java.util.List;

public class HomeZoo {
    List<Animal> animals = new ArrayList<>();

    public List<Animal> addAnimal(Animal newAnimal) {
        animals.add(0,newAnimal);
        return animals;
    }

    public void demonstrateZoo() {
        animals.forEach(i-> System.out.println(i));
    }

    public String getMaxSpeed() {
        int maxSpeed = 0;
        for (Animal i: animals){
            if (i instanceof Runable){
                if (((Runable) i).speedAnimal()>maxSpeed) maxSpeed=((Runable) i).speedAnimal();
            }

        }
        if (maxSpeed==0) return "бегающих животных в зоопарке нет";
        else return String.format("максимальная скорость бега %d",maxSpeed);
    }

    public String getMaxSpeedFloat() {
        int max = 0;
        for (Animal i:animals){
            if (i instanceof Floating) {
                if (((Floating) i).speedFloat()>max) max = ((Floating) i).speedFloat();
            }

        }
        if (max==0) return "плавающих животных в зоопарке нет";
        else return String.format("максимальная скорость плавания %d",max);
    }

    public String getCookingRecipe() {
        int max = 0;
        String result = " ";
        for (Animal i:animals){
            if (i instanceof Cooking) {
                result= result+((Cooking) i).cooked()+"\n";
            }

        }
        if (result.equals(" ")) return "пригодные к употреблению в пищу отсутствуют";
        else return result;
    }

    public static void main(String[] args) {
        HomeZoo zoo = new HomeZoo();
        zoo.addAnimal(new Cat("Мурка",4,6));
        zoo.addAnimal(new Dog("Барбос",4,8));
        zoo.addAnimal(new Wolf("Клык",4,12));
        zoo.addAnimal(new Сock("Петя",2,8));
        zoo.addAnimal(new Fish("Пучеглазка",0,3));

        System.out.println("----------------в домашнем зоопарке имеются---------------");
        zoo.demonstrateZoo();

        System.out.println("----------------наши животные говорят так---------------------");
        for (Animal i: zoo.animals) {
            System.out.println(i.talkAnimal());
        }
        System.out.println("-----------наши животные бегают так---------------------");
        System.out.println(zoo.getMaxSpeed());
        System.out.println("--------------наши животные плавают так-----------------");
        System.out.println(zoo.getMaxSpeedFloat());
        System.out.println("----------------наши съедобные животные------------------");
        System.out.println(zoo.getCookingRecipe());

    }
}
