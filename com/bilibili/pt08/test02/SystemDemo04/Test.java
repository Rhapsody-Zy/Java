package com.bilibili.pt08.test02.SystemDemo04;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("熏",16);
        Student s2 = new Student("椿",17);
        Student s3 = new Student("有马",17);

        Student arr1[] = {s1, s2, s3};
        //
        Person[] arr2 = new Person[3];

        System.arraycopy(arr1,0,arr2,0,3);

        for (int i = 0; i < arr2.length; i++) {
            Student stu = (Student) arr2[i];
            System.out.println(stu.getName() + ", " + stu.getAge());
        }
    }
}
