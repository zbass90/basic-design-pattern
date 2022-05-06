package com.basic.design.adapter;

public class HairDryer implements Electronic110V{
    @Override
    public void powerOn() {
        System.out.println("HairDryer - 110V On. ");
    }
}
