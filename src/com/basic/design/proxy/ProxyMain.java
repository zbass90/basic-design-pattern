package com.basic.design.proxy;

import com.basic.design.aop.AopBrowser;

import java.util.concurrent.atomic.AtomicLong;

public class ProxyMain {
    public static void main(String[] args) {
        Browser bw = new Browser("www.naver.com");
        bw.show();
        IBrowser browser = new BrowserProxy("www.naver.com");
        browser.show();

        AtomicLong start = new AtomicLong(); //동시성 이슈
        AtomicLong end = new AtomicLong();
        IBrowser aopBrowser = new AopBrowser("www.naver.com",
                ()->{
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                ()->{
                    long now = System.currentTimeMillis();
                    end.set(now - start.get());
                });

        aopBrowser.show();
        System.out.println("loading time : "+end.get());

        aopBrowser.show();
        System.out.println("loading time : "+end.get());

        aopBrowser.show();
        System.out.println("loading time : "+end.get());
    }
}
