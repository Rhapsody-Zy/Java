package bilibili.src.pt08.test10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Test04 {
    public static void main(String[] args) throws ParseException {


        //JDK7
        //1.计算出生年月日的毫秒值
        String birthday = "2002年03月05日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf.parse(birthday);
        long birthdayTime = date.getTime();
        //2.获取当前时间的毫秒值
        long todayTime = System.currentTimeMillis();
        //3.计算间隔多少天
        long time = todayTime - birthdayTime;
        System.out.println(time / 1000 / 60 / 60 / 24);

        //JDK8
        LocalDate ld1 = LocalDate.of(2002, 3, 5);
        LocalDate ld2 = LocalDate.now();

        long days = ChronoUnit.DAYS.between(ld1, ld2);
        System.out.println(days);
    }
}
