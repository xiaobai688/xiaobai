package com.ssm.service.impl;

import com.ssm.dao.StudentDao;
import com.ssm.entry.Student;
import com.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;
    @Override
    public Student queryStudentByStuno(int id) {
        return studentDao.queryStudentByStuno(id);
    }
}
