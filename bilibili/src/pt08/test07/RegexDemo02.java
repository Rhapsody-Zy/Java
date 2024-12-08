package bilibili.src.pt08.test07;

public class RegexDemo02 {
    public static void main(String[] args) {

        /*需求
        请编写正则表达式验证用户输入的手机号码是否满足要求。
        请编写正则表达式验证用户输入的邮箱号是否满足要求。
        请编写正则表达式验证用户输入的电话号码是否满足要求。
        验证手机号码  13112345678  13712345667  13945679027  139456790271
        验证座机电话号码  020-2324242  02122442  027-42424  0712-3242434
        验证邮箱号码  3232323@qq.com  zhangsan@itcast.cnn  dleieee9@163.com  dleieee9@pci.com.cn
*/
        //验证手机号码
        String regex1 = "1[3-9]\\d{9}";
        System.out.println("13112345678".matches(regex1));
        System.out.println("139456790271".matches(regex1));

        System.out.println("-----------------------------");

        //验证座机电话号码
        String regex2 = "0\\d{2,3}-?[1-9]\\d{4,9}";
        System.out.println("020-2324242".matches(regex2));

        System.out.println("-----------------------------");

        //验证邮箱号码
        //加括号是将那些看作一个组，进行数量判断
        String regex3 = "\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";
        System.out.println("dleieee9@pci.com.cn".matches(regex3));

        //插件 any-rule
        String regex4 = "([01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d";


    }

}
