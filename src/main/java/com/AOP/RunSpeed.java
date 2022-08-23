package com.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
//@Aspect
public class RunSpeed {
    @Pointcut("execution(* com.service.imp.UserServiceImpl.selectCount())")
    private void test2(){}

    @Around("test2()")
    public int runSpeed(ProceedingJoinPoint pjp) throws Throwable{
        int start = (int) System.currentTimeMillis();
        for (int i =0; i<10000; i++)
        {
            pjp.proceed();
        }
        int end = (int) System.currentTimeMillis();
        System.out.println(pjp.getSignature().getDeclaringType()+
                pjp.getSignature().getDeclaringType().getName()+
                "万次执行时间"+(end-start)+"ms");
        return 0;
    }
}
