package com.cxl.ch6;

public class StaffTest {
    public static void main(String[] args) {
        Staff staff = new Staff();
        staff.setNum("110");
        staff.setName("张三");
        staff.setSalary(7000.0);
        System.out.println(staff);

        Staff staff1 = new Staff();
        staff.setNum("111");
        staff.setName("李四");
        staff.setSalary(8000.0);
        System.out.println(staff1);
    }
}
