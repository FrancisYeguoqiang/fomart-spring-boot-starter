package com.francis.starter.format;

import java.util.Objects;

/**
 * @Author Francis
 * @Date 2021/4/24 19:02
 * @Version 1.0
 * @Description:
 */
public class StringFormatProcessor implements FormatProcessor{
    @Override
    public <T> String format(T obj) {
        return "StringFormatProcessor:"+ Objects.toString(obj);
    }
}
