package com.teachmeskills.hw07.exercise01;

public class Exercise01 {
    public static void main(String[] args) {
        Phone samsung = new Phone("8 (910) 437-49-17", "X100", 0.3);
        Phone siemens = new Phone("8 (905) 105-10-14", "CX75", 0.4);
        Phone sonyEricson = new Phone("8 (901) 255-30-30", "K750", 0.45);

        String samsungDescription = samsung.toString();
        String siemensDescription = siemens.toString();
        String sonyEricsonDescription = sonyEricson.toString();

        System.out.println(samsungDescription);
        System.out.println(siemensDescription);
        System.out.println(sonyEricsonDescription);

        samsung.receiveCall("Лев");
        System.out.println(samsung.getNumber());

        siemens.receiveCall("Евгений");
        System.out.println(siemens.getNumber());

        sonyEricson.receiveCall("Сергей");
        System.out.println(sonyEricson.getNumber());

        samsung.receiveCall("Лев", "8 (915) 830-40-50");
        siemens.receiveCall("Евгений", "8 (920) 322-22-17");
        sonyEricson.receiveCall("Сергей", "8 (930) 472-55-23");

        samsung.sendMessage("8 (911) 454-12-15", "8 (930) 350-60-10");
        siemens.sendMessage("8 (908) 109-99-71", "8 (961) 721-40-20", "8 (960) 119-19-27");
        sonyEricson.sendMessage("8 (902) 591-36-82");
    }
}
