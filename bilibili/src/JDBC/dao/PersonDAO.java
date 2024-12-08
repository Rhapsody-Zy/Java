package bilibili.src.JDBC.dao;

import bilibili.src.JDBC.pojo.Person;

import java.util.List;

public interface PersonDAO {
    boolean addPerson(Person person);
    boolean delPerson(int pid);
    boolean updatePerson(Person person);
    List<Person> getPersonList();
    Person getPersonByPid(int pid);

}
