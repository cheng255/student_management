package com.cheng.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author nuonuo
 * @create 2021-12-05 8:59
 */
@Data
@TableName("course")
public class Course {

    @TableId("id")
    private Integer id;

    @TableField("name")
    private String name;

}
