package com.bilibili.pt12.a04Exception;

public class Student2 {
    private String name;
    private int age;

    public Student2() {
    }

    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        if (name.length() > 10 || name.length() < 2){
            throw new NameFormatException(name + "名字格式有误，长度应为3~10");
        }
        this.name = name;

    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        if (age < 18 || age > 25) {
            throw new AgeOutOfBoundException(age + "年龄范围错误");
        }
        this.age = age;

    }

    public String toString() {
        return "Student2{name = " + name + ", age = " + age + "}";
    }
}
