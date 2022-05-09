package com.basic.design.strategy;

public class AppendStrategy implements EncodingStrategy{
    @Override
    public String encode(String text) {
        return "AppendTest,"+text;
    }
}
