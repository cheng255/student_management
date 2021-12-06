package com.cheng.controller;

import com.cheng.bean.Student;
import com.cheng.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author nuonuo
 * @create 2021-12-05 11:09
 */
@RestController
@RequestMapping("/stu/")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("get")
    public List<Student> getAll() {
        return studentService.getAll();
    }
    @PostMapping("edit")
    public Object edit(@RequestBody Student student) {
        return studentService.edit(student);
    }

    @PostMapping("add")
    public Object add(@RequestBody Student student) {
        return studentService.add(student);
    }
    @PostMapping("delete")
    public Object delete(@RequestBody Integer id) {
        return studentService.delete(id);
    }
}
