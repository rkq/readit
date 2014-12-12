package org.example.readit.controller;

import org.example.readit.domain.Login;
import org.example.readit.domain.Summary;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author    Rick Qiu
 * Email     qiudejun@gmail.com
 * Date      12/11/14
 * Time      10:34 AM
 */
@RestController
public class ReadItController {
    private static final Logger LOG = LoggerFactory.getLogger(ReadItController.class);
    @RequestMapping(value={"", "/", "/home"})
    public Summary home() {
        return new Summary();
    }
/*
    @RequestMapping(value={"/login"}, method= RequestMethod.POST)
    public Login login(@RequestParam(value="username") String username,
                       @RequestParam(value="password") String password) {
        LOG.info(String.format("login request received, username = %s", username));
        return new Login();
    }*/
}
