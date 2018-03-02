package cn.nexuslink.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/8/9.
 */
@Aspect
@Component
public class HttpAspect {

    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    @Pointcut("execution(public * cn.cqupt.controller.*.*(..))")
    public void log(){
        System.out.println("Controller 执行开始ʼ");
    }

    @Before("log()")
    public void doBefore(JoinPoint joinPoint){
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        //url
        logger.info("url={}",request.getRequestURL());
        //method
        logger.info("method={}",request.getMethod());
        //ip
        logger.info("ip={}",request.getRemoteAddr());
        //class_method
        logger.info("class_method",
                joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        //args
        logger.info("args={}", joinPoint.getArgs());

        logger.info("Controller 执行");
        //System.out.println("Controller ִ�п�ʼ");
    }

    @After("log()")
    public void doAfter(){
        logger.info("Controller 执行成功");
        //System.out.println("Controller ִ�����");
    }

    @AfterReturning(pointcut = "log()", returning = "object")
    public void doAfterReturn (Object object){
        logger.info("return = {}",object);
    }
}
