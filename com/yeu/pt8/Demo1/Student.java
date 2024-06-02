package com.yeu.pt8.Demo1;

public class Student extends Person{
    private String school;

    public Student(){
        super();
    }
    public Student(String school){
        this.school = school;
    }
    public Student(String name,int age,String school){
        super(name,age);
        this.school = school;
    }
    public String getSchool(){
        return school;
    }
    public void setSchool(String school){
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "school='" + school + '\'' +
                '}';
    }
}
