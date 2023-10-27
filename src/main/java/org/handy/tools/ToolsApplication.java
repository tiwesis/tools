package org.handy.tools;

import org.handy.tools.log.impl.Log4Tools;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToolsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ToolsApplication.class, args);
        Log4Tools.LogUtils toolsLogger = Log4Tools.getToolsLogger();
        toolsLogger.d(ToolsApplication.class.getSimpleName(), "SpringApplication.run");
    }

}
