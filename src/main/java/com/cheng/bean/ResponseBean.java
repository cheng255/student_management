package com.cheng.bean;

import lombok.Data;

/**
 * @author nuonuo
 * @create 2021-12-05 9:07
 */
@Data
public class ResponseBean {

    //学生信息
    private Integer id;
    private String name;
    private String major;
    private String grade;
    //分数
    private String course;
    private Double score;
}
