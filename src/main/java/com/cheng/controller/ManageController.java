package com.cheng.controller;

import com.cheng.bean.ResponseBean;
import com.cheng.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author nuonuo
 * @create 2021-12-05 9:55
 */
@RestController
@RequestMapping("/manage/")
public class ManageController {

    @Autowired
    ManageService manageService;

    @GetMapping("get")
    public List<ResponseBean> getAll() {
        List<ResponseBean> responseBeans = manageService.getAll();
        System.out.println(responseBeans);
        return responseBeans;
    }

    @GetMapping("get1")
    public List<ResponseBean> getAll1() {
        List<ResponseBean> responseBeans = manageService.getAllSortByScore();
        System.out.println(responseBeans);
        return responseBeans;
    }
    @GetMapping("get2")
    public List<ResponseBean> getAll2() {
        List<ResponseBean> responseBeans = manageService.getAllSortByMajorAndGrade();
        System.out.println(responseBeans);
        return responseBeans;
    }
    @GetMapping("get3")
    public List<ResponseBean> getAll3() {
        List<ResponseBean> responseBeans = manageService.getAllSortByCourseAndScore();
        System.out.println(responseBeans);
        return responseBeans;
    }
}
