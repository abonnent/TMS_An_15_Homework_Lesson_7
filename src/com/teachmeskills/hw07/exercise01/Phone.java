package com.teachmeskills.hw07.exercise01;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone() {
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Телефон: " +
                "номер: '" + number + '\'' +
                ", модель: '" + model + '\'' +
                ", вес: " + weight;
    }

    public void receiveCall(String name) {
        System.out.println("");
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("");
        System.out.println("Звонит " + name);
        System.out.println(number);
    }

    public void sendMessage(String... numbers) {
        System.out.println("");
        for (String number : numbers) {
            System.out.println("Сообщение отправлено по номеру: " + number);
        }
    }
}
