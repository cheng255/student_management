package com.cheng.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cheng.bean.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author nuonuo
 * @create 2021-12-05 9:13
 */
@Mapper
@Component
public interface StudentMapper extends BaseMapper<Student> {
}
