package bilibili.src.pt08.test04;

//Cloneable
//如果一个接口里面没有抽象方法
//表示当前的接口是一个标记性接口
//现在Cloneable表示一旦了实现，那么当前类的对象就可以被克隆
//如果没有实现，当前类的对象就不能克隆

public class User implements Cloneable{

    private int id;
    private String name;
    private String password;


    public User() {
    }

    public User(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() {
        return "User{id = " + id + ", name = " + name + ", password = " + password + "}";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //调用父类的clone方法
        //相当于让Java帮我们克隆一个对象
        return super.clone();
    }
}
