package com.cheng.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author nuonuo
 * @create 2021-12-05 9:00
 */
@Data
@TableName("score")
public class Score {
    @TableId("id")
    private Integer id;

    @TableField("course_id")
    private Integer courseId;

    @TableField("score")
    private Double score;
}
