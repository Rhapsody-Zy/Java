package pt5.demo1;

public class User {
    private String userName;
    private String password;

    public User(String userName, String password) {
            this(userName);
        this.password = password;
    }

    public User(String userName) {
        this.userName = userName;
    }

    public void test1(){
        System.out.println(this.password);
        this.test2();
    }

    public void test2(){
        System.out.println("test2");
    }

    public User ret(){
        return this;
    }
}
