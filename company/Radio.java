package com.company;

public class Radio implements Talkable{

    @Override
    public void talk() {
        System.out.println("Звучит прятная музыка...");
    }
}
