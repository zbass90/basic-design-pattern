package com.basic.design.adapter;

public class AdapterMain {
    public static void main(String[] args) {
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Cleaner cleaner = new Cleaner();
        Electronic110V adapter = new SocketAdapter(cleaner);
        connect(adapter);

        AirConditioner ac = new AirConditioner();
        Electronic110V airAdapter = new SocketAdapter(ac);
        connect(airAdapter);
    }
    // Adapter 콘센트
    public static void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    }
}
