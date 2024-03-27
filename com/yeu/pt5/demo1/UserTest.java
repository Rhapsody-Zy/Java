package pt5.demo1;

public class UserTest {
    public static void main(String[] args) {
        User user = new User("张三","123");
        User ret = user.ret();
        System.out.println(user == ret);
    }
}
