package com.basic.design.facade;

public class FacadeMain {
    public static void main(String[] args) {

        SftpClient sftpClient = new SftpClient("www.naver.com", 22, "/home/www","test.txt");
        sftpClient.connect();
        sftpClient.write();
        sftpClient.read();
        sftpClient.disConnect();

    }
}
