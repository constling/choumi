package com.yisui.service;

import com.yisui.dao.StudentDao;
import com.yisui.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoginService {

    private StudentDao studentDao;

    @Autowired
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public List<Student> QueryStudent() {
        return studentDao.queryStudents();
    }
}
