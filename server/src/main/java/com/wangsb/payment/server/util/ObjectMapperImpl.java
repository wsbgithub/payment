package com.wangsb.payment.server.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 自定义ObjectMapper组件实现
 *
 * @author wangsb
 * @version 1.0
 */
public class ObjectMapperImpl extends ObjectMapper {

    public ObjectMapperImpl() {
        // 设置在序列化时字段为NULL也进行序列化
        setSerializationInclusion(JsonInclude.Include.ALWAYS);
        // 设置反序列化时忽略JSON字符串中存在而Java对象实际没有的属性
        configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        // setTimeZone(TimeZone.getTimeZone(CoreConstant.DEFAULT_TIME_ZONE));
        //
        // // 设置日期格式化
        // setDateFormat(new SimpleDateFormat(CoreConstant.DATE_TIME_FORMAT_PATTERN));
        //
        // // Java8 日期相关
        // JavaTimeModule javaTimeModule = new JavaTimeModule();
        // javaTimeModule.addSerializer(LocalDateTime.class, new LocalDateTimeSerializer(DateTimeFormatter.ofPattern(CoreConstant.DATE_TIME_FORMAT_PATTERN)));
        // javaTimeModule.addSerializer(LocalDate.class, new LocalDateSerializer(DateTimeFormatter.ofPattern(CoreConstant.DATE_FORMAT_PATTERN)));
        // javaTimeModule.addSerializer(LocalTime.class, new LocalTimeSerializer(DateTimeFormatter.ofPattern(CoreConstant.TIME_FORMAT_PATTERN)));
        // javaTimeModule.addDeserializer(LocalDateTime.class, new LocalDateTimeDeserializer(DateTimeFormatter.ofPattern(CoreConstant.DATE_TIME_FORMAT_PATTERN)));
        // javaTimeModule.addDeserializer(LocalDate.class, new LocalDateDeserializer(DateTimeFormatter.ofPattern(CoreConstant.DATE_FORMAT_PATTERN)));
        // javaTimeModule.addDeserializer(LocalTime.class, new LocalTimeDeserializer(DateTimeFormatter.ofPattern(CoreConstant.TIME_FORMAT_PATTERN)));
        // registerModule(javaTimeModule);
    }
}