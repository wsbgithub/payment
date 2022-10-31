package com.wangsb.payment.business.controller;

import com.wangsb.payment.server.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 18133
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/hello")
    public Long hello() {
        return courseService.count();
    }


}
