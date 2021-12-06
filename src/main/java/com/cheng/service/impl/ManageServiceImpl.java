package com.cheng.service.impl;

import com.cheng.bean.ResponseBean;
import com.cheng.mapper.CourseMapper;
import com.cheng.mapper.ManageMapper;
import com.cheng.mapper.ScoreMapper;
import com.cheng.mapper.StudentMapper;
import com.cheng.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author nuonuo
 * @create 2021-12-05 9:16
 */
@Service
public class ManageServiceImpl implements ManageService {
    @Autowired
    private CourseMapper courseMapper;
    @Autowired
    private ScoreMapper scoreMapper;
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private ManageMapper manageMapper;

    public List<ResponseBean> getAll() {
        List<ResponseBean> responseBeanList = manageMapper.getAll();
        return responseBeanList;
    }

    public List<ResponseBean> getAllSortByScore() {
        List<ResponseBean> responseBeanList = getAll();
        responseBeanList.sort((o1, o2) -> o2.getScore().compareTo(o1.getScore()));
        return responseBeanList;
    }

    public List<ResponseBean> getAllSortByMajorAndGrade() {
        List<ResponseBean> responseBeanList = getAll();
        responseBeanList.sort((o1, o2) -> {
            if (o1.getMajor().equals(o2.getMajor())) {
                return o1.getGrade().compareTo(o2.getGrade());
            }
            return o1.getMajor().compareTo(o2.getMajor());
        });
        return responseBeanList;
    }

    public List<ResponseBean> getAllSortByCourseAndScore() {
        List<ResponseBean> responseBeanList = getAll();
        responseBeanList.sort((o1, o2) -> {
            if (o1.getCourse().equals(o2.getCourse())) {
                return o2.getScore().compareTo(o1.getScore());
            }
            return o1.getCourse().compareTo(o2.getCourse());
        });
        return responseBeanList;
    }
}
