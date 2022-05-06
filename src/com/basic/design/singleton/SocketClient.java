package com.basic.design.singleton;

public class SocketClient {
    /**
     * Singleton Pattern
     * 자기 자신을 객체로 가진다.
     * 기본생성자를 통해 생성할 수 없도록 막는다.
     * 글로벌하게 접근 가능하도록 설정한다.
     */
    private static SocketClient socketClient = null;

    private SocketClient(){}

    public static SocketClient getInstance(){
        if(socketClient == null){
            socketClient = new SocketClient();
        }
        return socketClient;
    }

    public void connect(){
        System.out.println("connect 연결됨.");
    }
}
