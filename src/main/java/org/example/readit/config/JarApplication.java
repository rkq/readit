package org.example.readit.config;

import org.example.readit.controller.GreetingController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

/**
 * Author    Rick Qiu
 * Email     qiudejun@gmail.com
 * Date      12/11/14
 * Time      9:33 AM
 */
@ComponentScan(basePackages = "org.example.readit")
@EnableAutoConfiguration
public class JarApplication {
    private static final Logger LOG = LoggerFactory.getLogger(JarApplication.class);

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(JarApplication.class, args);
    }
}
