package com.example.demo.user;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {


    public static void main(String[] args) {

        //<!-- 从高到地低 OFF 、 FATAL 、 ERROR 、 WARN 、 INFO 、 DEBUG 、 TRACE 、 ALL -->
        log.error("=========error========");
        log.info("========info=========");
        log.debug("=======debug==========");
        log.warn("========warn=========");
        log.trace("========trace=========");
    }









}
