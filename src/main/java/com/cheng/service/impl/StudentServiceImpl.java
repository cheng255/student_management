package com.cheng.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cheng.bean.Student;
import com.cheng.mapper.StudentMapper;
import com.cheng.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author nuonuo
 * @create 2021-12-05 11:09
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> getAll() {
        return studentMapper.selectList(null);
    }

    @Override
    public Object edit(Student student) {
        System.out.println(student);
        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", student.getId());
        return studentMapper.updateById(student);
    }

    @Override
    public Object add(Student student) {
        return studentMapper.insert(student);
    }

    @Override
    public Object delete(Integer id) {
        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", id);
        return studentMapper.delete(queryWrapper);
    }
}
