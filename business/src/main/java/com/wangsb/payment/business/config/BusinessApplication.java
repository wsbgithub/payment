package com.wangsb.payment.business.config;


import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import springfox.documentation.oas.annotations.EnableOpenApi;


/**
 * @author 18133
 */
@SpringBootApplication
@EnableOpenApi
@ComponentScan("com.wangsb")
@MapperScan("com.wangsb.payment.server.mapper")
public class BusinessApplication {

    private static final Logger LOG = LoggerFactory.getLogger(BusinessApplication.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(BusinessApplication.class);
        Environment env = app.run(args).getEnvironment();
        LOG.info("启动成功！！");
        LOG.info("Swagger3测试地址: \t http://localhost:{}/business/swagger-ui/index.html", 8000);


    }
}
