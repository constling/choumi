package com.yisui.service;

import com.yisui.dao.StudentDao;
import com.yisui.model.Student;

import java.util.ArrayList;

public class LoginService {

    private StudentDao studentDao_;

    public void setStudentDao_(StudentDao studentDao_) {
        this.studentDao_ = studentDao_;
    }

    public ArrayList<Student> QueryStudent() {
        return studentDao_.queryStudents();
    }
}
