package com.cheng.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author nuonuo
 * @create 2021-12-05 8:50
 */
@Data
@TableName("student")
public class Student {

    @TableId("id")
    private Integer id;

    @TableField("name")
    private String name;

    @TableField("age")
    private Integer age;

    @TableField("sex")
    private String sex;

    @TableField("major")
    private String major;//专业

    @TableField("grade")
    private String grade;//年级

    @TableField("password")
    private String password;//密码
}
