package com.basic.design.proxy;

public class Browser implements IBrowser{
    private String url;

    public Browser(String url){
        this.url = url;
    }

    @Override
    public Html show() {
        System.out.println("brower loading html from : "+url);
        return new Html(url);
    }
}
