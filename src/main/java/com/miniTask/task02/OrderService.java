package com.miniTask.task02;

public class OrderService {
    private PaypalGateway paypalGateway;

    public OrderService(PaypalGateway paypalGateway) {
        this.paypalGateway = paypalGateway;
    }

    @Override
    public String toString() {
        return "Класс OrderService содержит класс paypalGateway с ID " + paypalGateway;
    }
}
