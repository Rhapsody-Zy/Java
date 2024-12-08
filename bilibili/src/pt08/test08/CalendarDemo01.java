package bilibili.src.pt08.test08;

import java.util.Calendar;
import java.util.Date;

//日历对象 - 通过getInstance方法获取对象
public class CalendarDemo01 {

    public static void main(String[] args) {
        //Calendar 是一个抽象方法（abstract），不可以new，而是通过一个静态方法获取到子类对象
        //底层原理：
        //会根据系统的不同时区来获取不同的日历对象
        //会把时间中的纪元，年，月，日，时，分，秒，星期，等等都放到一个数组当中
        //0 : 纪元
        //1 ： 年
        //2 ： 月
        //3 ： 一年中的第几周
        //4 ： 一个月中的第几周
        //5 ： 一个月中的第几天（日期）

        //细节2：
        //月份：范围0~11 0代表1月
        //星期日是一周中的第一天，1代表星期日
        Calendar c = Calendar.getInstance();
        Date d = new Date(0L);
        c.setTime(d);
        System.out.println(c);

        //public int get(int field)              取日期中的某个字段信息
        //public void set(int field,int value)   修改日历的某个字段信息
        //public void add(int field,int amount)  为某个字段增加/减少指定的值


        //修改
        c.set(Calendar.YEAR, 2006);
        c.set(Calendar.MONTH, 0);
        c.set(Calendar.DAY_OF_MONTH,11);


        //增加一个月
        c.add(Calendar.MONTH,1);


        //不需要记数字，可以直接用常量
        int year = c.get(1);
        int mouth = c.get(2) + 1;
        int day = c.get(5);
        int week = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(year + "," + mouth + "," + day + "," + getWeek(week));


    }

    public static String getWeek(int week) {
        String[] arr = {"","星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
        return arr[week];
    }


}
