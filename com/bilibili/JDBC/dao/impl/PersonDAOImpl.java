package com.yeu.JDBC.dao.impl;

import com.yeu.JDBC.dao.PersonDAO;
import com.yeu.JDBC.dao.base.BaseDAO;
import com.yeu.JDBC.pojo.Person;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonDAOImpl extends BaseDAO implements PersonDAO {
    Connection conn = null;
    PreparedStatement pstm = null;
    ResultSet rs = null;

    @Override
    public boolean addPerson(Person person) {
        String sql = "insert into t_person value(null,?,?,?,?)";
        return super.executeUpdate(sql, person.getName(), person.getPwd(), person.getGender(), person.getAddress());
    }

    @Override
    public boolean delPerson(int pid) {
        String sql = "delete from t_person where pid=?";
        return super.executeUpdate(sql, pid);
    }

    @Override
    public boolean updatePerson(Person person) {
        String sql = "update t_person set name=?, pwd=?, gender=?, address=? where pid=?";
        return super.executeUpdate(sql, person.getName(), person.getPwd(), person.getGender(), person.getAddress(), person.getPid());
    }

    @Override
    public List<Person> getPersonList() {
        List<Person> persons = new ArrayList<Person>();
        String sql = "select * from t_person";
        conn = getConn();
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                int pid = rs.getInt(1);
                String name = rs.getString(2);
                String pwd = rs.getString(3);
                String gender = rs.getString(4);
                String address = rs.getString(5);
                Person person = new Person(pid, name, pwd, gender, address);
                persons.add(person);
            }
            return persons;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(rs, pstm, conn);
        }
        return null;
    }

    @Override
    public Person getPersonByPid(int pid) {
        String sql = "select * from t_person where pid=?";
        conn = getConn();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, pid);
            rs = pstm.executeQuery();
            if (rs.next()) {
                String name = rs.getString(2);
                String pwd = rs.getString(3);
                String gender = rs.getString(4);
                String address = rs.getString(5);
                return new Person(pid, name, pwd, gender, address);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(rs, pstm, conn);
        }
        return null;
    }
}
