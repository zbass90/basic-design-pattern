package com.basic.design.strategy;

public class StrategyMain {
    public static void main(String[] args) {
        Encoder encoder = new Encoder();

        //base64
        EncodingStrategy base64 = new Base64Strategy();

        //normal
        EncodingStrategy normal = new NormalStrategy();

        String message = "hello java";
        encoder.setEncodingStrategy(base64);
        String base64Result = encoder.getMessage(message);

        encoder.setEncodingStrategy(normal);
        String normalResult = encoder.getMessage(message);



        encoder.setEncodingStrategy(new AppendStrategy());
        String appendResult = encoder.getMessage(message);

        System.out.println(base64Result);
        System.out.println(normalResult);
        System.out.println(appendResult);
    }
}
