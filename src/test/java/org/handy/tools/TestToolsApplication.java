package org.handy.tools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestToolsApplication {

    public static void main(String[] args) {
        SpringApplication.from(ToolsApplication::main).with(TestToolsApplication.class).run(args);
    }

}
