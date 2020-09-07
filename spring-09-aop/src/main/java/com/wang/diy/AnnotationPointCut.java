package com.wang.diy;

//使用注解方式实现AOP

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//标注这个类是一个切面
@Aspect
public class AnnotationPointCut {

    @Before("execution(* com.wang.service.UserServiceImpl .*(..))")
    public void before() {
        System.out.println("====================before execution====================");
    }

    @After("execution(* com.wang.service.UserServiceImpl .*(..))")
    public void after() {
        System.out.println("====================after execution====================");
    }

    //在环绕增强中,我们可以给定一个参数,达标我们要获取切入的点
    @Around("execution(* com.wang.service.UserServiceImpl .*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("before around");

        //获得签名
        Signature signature = joinPoint.getSignature();
        System.out.println("signature " + signature);

        //执行方法
        Object proceed = joinPoint.proceed();

        System.out.println("after around");

        System.out.println(proceed);
    }
}
