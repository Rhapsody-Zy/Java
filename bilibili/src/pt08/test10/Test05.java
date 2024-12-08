package bilibili.src.pt08.test10;

import java.time.LocalDate;
import java.util.Calendar;

public class Test05 {
    public static void main(String[] args) {
        //JDK7
        //把时间设置为2002年3月1日
        Calendar c = Calendar.getInstance();
        c.set(2002,2,1);
        //再把日历往前减一天
        c.add(Calendar.DAY_OF_MONTH,-1);
        //看当前的时间是28号还是29号
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);

        /*
        Calendar c2 = Calendar.getInstance();
        c2.set(2003,0,1);
        c.add(Calendar.DAY_OF_YEAR,-1);
        int day2 = c.get(Calendar.DAY_OF_YEAR);
        System.out.println(day2);
        */

        //JDK8
        LocalDate ld = LocalDate.of(2002, 3, 1);
        LocalDate ld2 = ld.minusDays(1);
        int day2 = ld2.getDayOfMonth();
        System.out.println(day2);

        //true:闰年
        //false:平年
        System.out.println(ld.isLeapYear());


    }
}
