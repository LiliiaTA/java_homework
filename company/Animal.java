package com.company;

public abstract class Animal implements Talkable{
    private String name;

    protected Animal(String name){ // непубличное использование
        setName(name);
    }

//    public abstract void talk(); // нет реализации, абстрактный метод

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public void show(){
        System.out.printf("Я %s.\n", toString());
        System.out.printf("Умею говорить: ");
        talk();
    }
}
