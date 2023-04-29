package com.company;

public class Dog extends Animal{

    public Dog(String name){
        super(name); // обращаемся к конструктору
    }

    @Override
    public void talk() {
        System.out.println("Гав-гав!");
    }

    @Override
    public String toString(){ //наследуется от обжект, всегде есть у классов
        return String.format("%s %s", "собака", getName());
    }

}
