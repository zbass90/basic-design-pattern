package com.basic.design.strategy;

public class NormalStrategy implements EncodingStrategy{
    @Override
    public String encode(String text) {
        return text;
    }
}
