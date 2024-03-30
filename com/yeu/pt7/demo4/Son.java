package com.yeu.pt7.demo4;

public class Son extends Father{

    public void readBood(){
        super.readBook();
        readSuperBook();
        readCartoon();
    }

    public void readSuperBook(){
        System.out.println("看名著");
    }
    public void readCartoon(){
        System.out.println("看漫画");
    }

}
