package com.miniTask.task02.service;

public class OrderService {
    private PaymentGateway gateway;

    public OrderService(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public String toString() {
        return "Класс OrderService содержит класс PaymentGateway: " + gateway;
    }
}
