package bilibili.src.JDBC.pojo;

public class Person {
    private int pid;
    private String name;
    private String pwd;
    private String gender;
    private String address;

    public Person() {
    }

    public Person(int pid, String name, String pwd, String gender, String address) {
        this.pid = pid;
        this.name = name;
        this.pwd = pwd;
        this.gender = gender;
        this.address = address;
    }

    public Person(String name, String pwd, String gender, String address) {
        this.name = name;
        this.pwd = pwd;
        this.gender = gender;
        this.address = address;
    }


    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
