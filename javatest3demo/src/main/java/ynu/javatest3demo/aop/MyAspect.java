package ynu.javatest3demo.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

    @Before(value = "execution(* ynu.javatest3demo.service.FilmService.*(..))")
    public void before(){
        System.out.println("Before Insert Film Data");
    }

    @After(value = "execution(* ynu.javatest3demo.service.FilmService.*(..))")
    public void after(){
        System.out.println("After Insert Film Data");
    }

}
