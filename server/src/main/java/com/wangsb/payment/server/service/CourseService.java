package com.wangsb.payment.server.service;


import cn.hutool.core.stream.StreamUtil;
import cn.hutool.core.util.StrUtil;
import com.wangsb.payment.server.domain.Course;
import com.wangsb.payment.server.domain.CourseExample;
import com.wangsb.payment.server.mapper.CourseMapper;
import com.wangsb.payment.server.req.CourseQueryReq;
import com.wangsb.payment.server.resp.CourseQueryResp;
import com.wangsb.payment.server.util.CopyUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 18133
 */
@Service
public class CourseService {

    @Resource
    private CourseMapper courseMapper;

    public long count() {
        return courseMapper.countByExample(null);
    }


    public List<CourseQueryResp> queryList(CourseQueryReq req) {
        String name = req.getName();
        CourseExample courseExample = new CourseExample();
        if (StrUtil.isNotBlank(name)) {
            courseExample.createCriteria().andNameLike("%" + name + "%");
        }
        List<Course> courses = courseMapper.selectByExample(courseExample);

        return CopyUtil.copyList(courses, CourseQueryResp.class);
    }
}
