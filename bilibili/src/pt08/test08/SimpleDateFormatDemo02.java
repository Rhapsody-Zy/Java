package bilibili.src.pt08.test08;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo02 {
    public static void main(String[] args) throws ParseException {

        //将日期2006-01-11 转换成 2006年1月11号
        String str = "2006-01-11";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf1.parse(str);
        long time = date.getTime();
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        String newDate = sdf2.format(time);
        System.out.println(newDate);

    }
}
