package com.wangsb.payment.business.controller;

import com.wangsb.payment.server.domain.Course;
import com.wangsb.payment.server.req.CourseQueryReq;
import com.wangsb.payment.server.resp.CommonResp;
import com.wangsb.payment.server.resp.CourseQueryResp;
import com.wangsb.payment.server.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 18133
 */
@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/query-list")
    public CommonResp<List<CourseQueryResp>> queryList(CourseQueryReq req) {

        CommonResp<List<CourseQueryResp>> commonResp = new CommonResp<>();

        List<CourseQueryResp> courseQueryResps = courseService.queryList(req);
        commonResp.setContent(courseQueryResps);
        return commonResp;
    }
}
