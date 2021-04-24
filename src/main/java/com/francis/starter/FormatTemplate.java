package com.francis.starter;

import com.francis.starter.configuration.FrancisProperties;
import com.francis.starter.format.FormatProcessor;

/**
 * @Author Francis
 * @Date 2021/4/24 19:07
 * @Version 1.0
 * @Description:
 */
public class FormatTemplate {

    private FormatProcessor formatProcessor;

    private FrancisProperties francisProperties;

    public FormatTemplate(FrancisProperties francisProperties, FormatProcessor formatProcessor) {
        this.formatProcessor = formatProcessor;
        this.francisProperties = francisProperties;
    }

    public <T> String doFormat(T obj){
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("begin:Execute format").append("<br/>");
        stringBuilder.append("HelloProperties:").append(formatProcessor.format(francisProperties.getInfo())).append("<br/>");
        stringBuilder.append("Obj format result:").append(formatProcessor.format(obj)).append("<br/>");
        return stringBuilder.toString();
    }

}
