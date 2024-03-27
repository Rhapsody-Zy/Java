package pt5.demo4;

public class ChinaPeopleTest {
    public static void main(String[] args) {
        ChinaPeople.country="中国";
        ChinaPeople chinaPeople = new ChinaPeople();
        chinaPeople.peopleName = "张三";
        chinaPeople.eat();
    }
}
