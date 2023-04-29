package com.company;

public class Cat extends Animal{

    public Cat(String name){
        super(name); // обращаемся к конструктору
    }

    @Override
    public void talk() {
        System.out.println("Мяу-мяу!");
    }

    @Override
    public String toString(){ //наследуется от обжект, всегде есть у классов
        return String.format("%s %s", "кошка", getName());
    }
}
