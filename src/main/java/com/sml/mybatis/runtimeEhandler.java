package com.sml.mybatis;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 神迷的亮
 * 2018-05-25 09:31
 */
@ControllerAdvice
@Slf4j
public class runtimeEhandler
{
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public String exce()
    {
        log.error("sun        ming    \t\t\t\n  liang");
        return "sun  ming  liang  aaaa";
    }
}
