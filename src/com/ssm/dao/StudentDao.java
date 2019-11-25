package com.ssm.dao;

import com.ssm.entry.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao {
    Student queryStudentByStuno(int id);
}
