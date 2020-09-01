package com.clear.annotation;

import java.lang.annotation.*;

/**
 * ClassName SysLog
 *  系统日志注解
 * @author qml
 * Date 2020/8/31 16:06
 * Version 1.0
 **/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SysMonitorLog {
    String value() default "";
}