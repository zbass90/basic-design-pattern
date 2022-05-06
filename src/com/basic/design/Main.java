package com.basic.design;

import com.basic.design.adapter.*;
import com.basic.design.aop.AopBrowser;
import com.basic.design.decorator.*;
import com.basic.design.proxy.Browser;
import com.basic.design.proxy.BrowserProxy;
import com.basic.design.proxy.IBrowser;
import com.basic.design.singleton.ASocket;
import com.basic.design.singleton.BSocket;
import com.basic.design.singleton.SocketClient;

import java.util.concurrent.atomic.AtomicLong;

public class Main {

    public static void main(String[] args) {
        /*
        ASocket a = new ASocket();
        BSocket b = new BSocket();

        SocketClient aClient = a.getSocketClient();
        SocketClient bClient = b.getSocketClient();

        System.out.println("두 개의 객체는 동일한가요?");
        System.out.println(aClient == bClient);
         */

        /*
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Cleaner cleaner = new Cleaner();
        Electronic110V adapter = new SocketAdapter(cleaner);
        connect(adapter);

        AirConditioner ac = new AirConditioner();
        Electronic110V airAdapter = new SocketAdapter(ac);
        connect(airAdapter);
         */

        /*
//        Browser bw = new Browser("www.naver.com");
//        bw.show();
//        IBrowser browser = new BrowserProxy("www.naver.com");
//        browser.show();

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
        */


        ICar audi = new Audi(1000);
        audi.showPrice();

        // a3
        ICar audi3 = new A3(audi, "A3");
        audi3.showPrice();

        // a4
        ICar audi4 = new A4(audi, "A4");
        audi4.showPrice();

        // a5
        ICar audi5 = new A5(audi, "A5");
        audi5.showPrice();

    }

    // Adapter 콘센트
    public static void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    }
}
