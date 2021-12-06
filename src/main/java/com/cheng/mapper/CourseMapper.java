package com.cheng.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cheng.bean.Course;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author nuonuo
 * @create 2021-12-05 9:14
 */
@Mapper
@Component
public interface CourseMapper extends BaseMapper<Course> {
}
