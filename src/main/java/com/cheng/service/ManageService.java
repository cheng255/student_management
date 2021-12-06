package com.cheng.service;

import com.cheng.bean.ResponseBean;

import java.util.List;

/**
 * @author nuonuo
 * @create 2021-12-05 9:15
 */
public interface ManageService {
    //拿到所有的信息
    List<ResponseBean> getAll();

    //按分数排序
    List<ResponseBean> getAllSortByScore();

    //按专业年级排序
    List<ResponseBean> getAllSortByMajorAndGrade();

    //按课程分数排序
    List<ResponseBean> getAllSortByCourseAndScore();


}
