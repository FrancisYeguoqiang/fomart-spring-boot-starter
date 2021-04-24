package com.francis.starter.format;

/**
 * @Author Francis
 * @Date 2021/4/24 19:00
 * @Version 1.0
 * @Description:
 */
public interface FormatProcessor {
    /**
     * 格式化接口
     *
     * @param obj
     * @param <T>
     * @return
     */
    <T> String format(T obj);
}
