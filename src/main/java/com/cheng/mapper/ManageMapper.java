package com.cheng.mapper;

import com.cheng.bean.ResponseBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author nuonuo
 * @create 2021-12-05 9:40
 */
@Component
@Mapper
public interface ManageMapper {

    @Select("SELECT student.id, student.name, student.major, student.grade, course.`name` course, score.`score` FROM student, course, score\n" +
            "WHERE course.`id` = score.`course_id` AND student.id = score.`student_id`")
    List<ResponseBean> getAll();
}
