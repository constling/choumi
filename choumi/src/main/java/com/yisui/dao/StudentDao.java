package com.yisui.dao;

import com.yisui.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

@Repository
public class StudentDao {

    private JdbcTemplate jdbcTemplate_;

    @Autowired
    public void setJdbcTemplate_(JdbcTemplate jdbcTemplate_) {
        this.jdbcTemplate_ = jdbcTemplate_;
    }

    private final static String QUERY_ALL_SQL = "select * from student";

    public ArrayList<Student> queryStudents() {

        final ArrayList<Student> students = new ArrayList<Student>();
        jdbcTemplate_.query(QUERY_ALL_SQL,  new Object[]{"",""}, new RowCallbackHandler() {
            public void processRow(ResultSet resultSet) throws SQLException {

                resultSet.beforeFirst();
                while (resultSet.next()){

                    Student item = new Student();
                    item.setId(resultSet.getInt("id"));
                    item.setName(resultSet.getString("name"));
                    item.setSex(resultSet.getInt("sex"));
                    students.add(item);
                }
            }
        });

        return students;
    }
}
