package com.yisui.dao;

import com.yisui.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private final static String QUERY_ALL_SQL = "select * from student";

    public List<Student> queryStudents() {

        return jdbcTemplate.query(QUERY_ALL_SQL, new RowMapper<Student>() {

            @Override
            public Student mapRow(ResultSet rs, int index) throws SQLException {
                Student student = new Student();
                student.setId(rs.getInt("id"));
                return student;
            }
        });
    }
}
