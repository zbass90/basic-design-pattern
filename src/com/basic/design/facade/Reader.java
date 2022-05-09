package com.basic.design.facade;

public class Reader {
    private String fileName;

    public Reader(String fileName){
        this.fileName = fileName;
    }

    public void fileConnect(){
        String msg = String.format("Reader %s로 연결함.",fileName);
        System.out.println(msg);
    }

    public void fileRead(){
        String msg = String.format("Reader %s의 내용을 읽어옴.",fileName);
        System.out.println(msg);
    }

    public void fileDisconnect(){
        String msg = String.format("Reader %s로 연결 종료됨.",fileName);
        System.out.println(msg);
    }
}
