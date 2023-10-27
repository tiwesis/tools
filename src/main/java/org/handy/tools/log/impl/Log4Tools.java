package org.handy.tools.log.impl;

/**
 * @author WT
 * 日志类，支持根据不同的日志等级进行不同的自定义操作
 * 共有以下四种等级：
 *      1、debug
 *      2、info
 *      3、warning
 *      4、error
 * 使用时需定义四种日志等级的消费方式，例如：Log4Tools.
 *
 */
public class Log4Tools {

    public volatile static LogUtils logger;

    /**
     * 服务于tools工程中需要信息上传，分类的场景
     * @return
     */
    public static LogUtils getToolsLogger(){
        if (logger == null) {
            synchronized (Log4Tools.class) {
                if (logger == null) {
                    return new LogUtils() {
                        @Override
                        public void d(String tag, String msg) {
                            System.out.println(tag + ": " + msg);
                        }

                        @Override
                        public void i(String tag, String msg) {
                            System.out.println(tag + ": " + msg);
                        }

                        @Override
                        public void w(String tag, String msg) {
                            System.out.println(tag + ": " + msg);
                        }

                        @Override
                        public void e(String tag, String msg) {
                            System.out.println(tag + ": " + msg);
                        }
                    };
                }
            }
        }
        return logger;
    }

    public interface LogUtils {
        public void d(String tag, String msg);
        public void i(String tag, String msg);
        public void w(String tag, String msg);
        public void e(String tag, String msg);
    }

}
