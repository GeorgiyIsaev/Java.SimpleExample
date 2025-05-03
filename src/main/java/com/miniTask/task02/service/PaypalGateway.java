package com.miniTask.task02.service;

public class PaypalGateway extends PaymentGateway{
    public PaypalGateway(int id) {
        super(id);
    }
    @Override
    public String toString() {
        return "PaypalGateway id:" + getId();
    }
}
