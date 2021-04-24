package com.francis.starter.format;

import com.alibaba.fastjson.JSON;

/**
 * @Author Francis
 * @Date 2021/4/24 19:01
 * @Version 1.0
 * @Description:
 */
public class JsonFormatProcessor implements FormatProcessor{
    @Override
    public <T> String format(T obj) {
        return "JsonFormatProcessor:"+ JSON.toJSONString(obj);
    }
}
