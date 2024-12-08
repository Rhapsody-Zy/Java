package bilibili.src.JDBC.test;

import bilibili.src.JDBC.dao.PersonDAO;
import bilibili.src.JDBC.dao.impl.PersonDAOImpl;

public class TestJDBC {
    public static void main(String[] args) {
        PersonDAO personDAO = new PersonDAOImpl();

        //1.添加
        //Person person = new Person("zy", "0305", "男", "江苏");
        //personDAO.addPerson(person);

        //2.查询
        //Person person = personDAO.getPersonByPid(2);
        //System.out.println(person);

        //3.查询所有
        //List<Person> personList = personDAO.getPersonList();
        //for (Person per : personList) {
        //    System.out.println(per);
        //}

        //4.修改记录
        //Person person = new Person(1,"fx","0111","女","心");
        //personDAO.updatePerson(person);

        //5.删除记录
        personDAO.delPerson(2);

    }
}
