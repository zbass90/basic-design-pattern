package com.basic.design.adapter;

public class SocketAdapter implements Electronic110V{

    /**
     * Adapter Pattern
     *  SocketAdapter는 220V->110V가 가능하도록 돼지코 역할을 해서 110V로 connect할 수 있도록 도와준다.
     * */

    private Electronic220V electronic220V;

    public SocketAdapter(Electronic220V electronic220V){
        this.electronic220V = electronic220V;
    }

    @Override
    public void powerOn() {
        electronic220V.connect();
    }
}
