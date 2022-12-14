package com.codekul.springCodekul.ioc;

public class Vodafone implements Sim{
    @Override
    public void calling() {
        System.out.println("Vodafone calling");
    }

    @Override
    public void msg() {
        System.out.println("Vodafone msg");
    }
}
