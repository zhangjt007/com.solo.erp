package com.solo.erp.controller.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Aspect
@Component
public class WebLogAspect {
    private Logger logger = LoggerFactory.getLogger(getClass());

    ThreadLocal<Long> startTime = new ThreadLocal<>();

    public WebLogAspect() {
        logger.debug("======= web log aspect ======");
    }

    @Pointcut("target(com.solo.erp.controller.base.BaseController)")
    public void webLog() {
    }

    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        startTime.set(System.currentTimeMillis());
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        // 记录下请求内容
        logger.info("请求地址:" + request.getRequestURL().toString());
        logger.info("请求方IP:" + request.getRemoteAddr());
        logger.info("请求参数:" + Arrays.toString(joinPoint.getArgs()));
    }

    @AfterReturning(returning = "ret", pointcut = "webLog()")
    public void doAfterReturning(Object ret) throws Throwable {
        // 处理完请求，返回内容
        logger.info("响应参数:" + ret);
        logger.info("响应时间:" + (System.currentTimeMillis() - startTime.get()));
    }

    /**
     * 后置异常通知
     */
    @AfterThrowing("webLog()")
    public void throwss(JoinPoint jp) {
        logger.error("[商品模块] 方法异常时执行.....");
        logger.info("响应时间:" + (System.currentTimeMillis() - startTime.get()));
    }
}
