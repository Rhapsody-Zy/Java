package com.bilibili.pt07.test06.demo2;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.lunch();

        System.out.println("-----------------");

        OverseasStudent overseasStudent = new OverseasStudent();
        overseasStudent.lunch();
    }
}

class Person {
    public void eat() {
        System.out.println("吃米饭");
    }

    public void drink() {
        System.out.println("喝开水");
    }
}

class Student extends Person {
    public void lunch() {

        //先在本类中查看eat和drink方法，有的话直接调用，没有的话，就会调用从父类中继承下来的eat和drink方法
        eat();
        drink();

        this.eat();
        this.drink();

        //直接调用父类中的方法
        super.eat();
        super.drink();
    }
}

class OverseasStudent extends Person {
    public void lunch() {
        this.eat();
        this.drink();

        super.eat();
        super.drink();
    }

    //方法重写
    //当父类的方法不能满足子类的需求时，需要进行方法重写
    // @Override 重写注解

    @Override
    public void eat(){
        System.out.println("吃凉面");
    }

    @Override
    public void drink(){
        System.out.println("喝凉水");
    }
}
