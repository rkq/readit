package org.example.readit.controller;
import java.util.concurrent.atomic.AtomicLong;

import org.example.readit.domain.Greeting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.userdetails.User;
/**
 * Author    Rick Qiu
 * Email     qiudejun@gmail.com
 * Date      12/11/14
 * Time      9:31 AM
 */
@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private static final Logger LOG = LoggerFactory.getLogger(GreetingController.class);
    @Autowired
    private CounterService counterService;

    @RequestMapping("/greeting")
    public Greeting greeting(@AuthenticationPrincipal User user) {
        LOG.info(String.format("request received, parameter name = %s", user.getUsername()));
        counterService.increment("greeting.count");
        return new Greeting(counter.incrementAndGet(),
                String.format(template, user.getUsername()));
    }
}
