package com.miniTask.task03.main;

import com.miniTask.task03.containers.MiniList;

public class Task01_MiniList {
    public static void main(String[] args) {
        MiniList<Integer> miniList = new MiniList<Integer>();
        System.out.println("miniList: " + miniList);

        miniList.addLast(100);
        miniList.addLast(750);
        miniList.addLast(44);
        miniList.addLast(657);
        miniList.addLast(125);
        System.out.println("miniList for added: " + miniList);

        while (miniList.getSize() > 0) {
            Integer value = miniList.removeFirst();
            System.out.println("removeFirst value: " + value);
            System.out.println("miniList for removeFirst: " + miniList);
        }
        System.out.println("miniList end: " + miniList);
    }
}
