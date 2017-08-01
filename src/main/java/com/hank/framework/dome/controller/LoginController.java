package com.hank.framework.dome.controller;

import com.hank.framework.dome.Students;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hank.he on 2017/7/28.
 */
@RestController
@RequestMapping("/login")
public class LoginController {
    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);


    @RequestMapping("/info/{id}")
    public Students getStudentsInfo(@PathVariable("id") String id) {
        logger.info("into method:id===>>" + id);
        return new Students("hank", "1", "USA");
    }
}
