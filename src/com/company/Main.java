package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        User newUser = new User();

        newUser.setNama("Jerry");
        newUser.setHP("0813123456");

        System.out.println(newUser.getInfo());

        TestingFitur1 newTest = new TestingFitur1();
        newTest.setCoverage(50);

        System.out.println(newTest);

        newUser.setNama("Hari");
        newUser.setHP("08138656");
    }
}
