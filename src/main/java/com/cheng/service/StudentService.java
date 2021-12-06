package com.cheng.service;

import com.cheng.bean.Student;

import java.util.List;

/**
 * @author nuonuo
 * @create 2021-12-05 11:08
 */
public interface StudentService {

    List<Student> getAll();

    Object edit(Student student);

    Object add(Student student);

    Object delete(Integer id);
}
