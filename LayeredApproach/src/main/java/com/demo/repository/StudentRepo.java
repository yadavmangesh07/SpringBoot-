package com.demo.repository;


import com.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    @Autowired
    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student student) {
        String sql="insert into student(roll_no,name,age) values(?,?,?)";
        int rows=jdbc.update(sql,student.getRoll_no(),student.getName(),student.getAge());
        System.out.println("Rows Affected :"+rows);
    }

    public List<Student> findAll() {
        String sql="select * from student";
        RowMapper<Student> rowMapper=new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student s=new Student();
                s.setRoll_no(rs.getInt("roll_no"));
                s.setName(rs.getString("name"));
                s.setAge(rs.getInt("age"));
                return s;
            }
        };
        return jdbc.query(sql,rowMapper);
    }
}
