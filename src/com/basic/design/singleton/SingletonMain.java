package com.basic.design.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        ASocket a = new ASocket();
        BSocket b = new BSocket();

        SocketClient aClient = a.getSocketClient();
        SocketClient bClient = b.getSocketClient();

        System.out.println("두 개의 객체는 동일한가요?");
        System.out.println(aClient == bClient);
    }
}
