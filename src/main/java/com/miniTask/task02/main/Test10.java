package com.miniTask.task02.main;

import com.miniTask.task02.service.OrderService;
import com.miniTask.task02.service.PaypalGateway;

public class Test10 {
    public static void main(String[] args) {
        //| 10 | Dependency Injection (лайт) | Класс OrderService принимает в конструкторе PaymentGateway gateway.
        // В main создайте OrderService и передайте туда new PaypalGateway(). |
        OrderService orderService = new OrderService(new PaypalGateway(0));
        System.out.println(orderService);
    }
}
