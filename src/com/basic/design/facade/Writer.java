package com.basic.design.facade;

public class Writer {
    private String fileName;

    public Writer(String fileName) {
        this.fileName = fileName;
    }

    public void fileConnect(){
        String msg = String.format("Writer %s로 연결함.",fileName);
        System.out.println(msg);
    }

    public void fileDisconnect(){
        String msg = String.format("Writer %s로 연결 종료됨.",fileName);
        System.out.println(msg);
    }

    public void fileWrtie(){
        String msg = String.format("Writer %s로 파일쓰기함.",fileName);
        System.out.println(msg);
    }

}
