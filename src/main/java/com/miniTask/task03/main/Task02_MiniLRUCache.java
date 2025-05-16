package com.miniTask.task03.main;

import com.miniTask.task03.miniList.MiniLRUCache;

public class Task02_MiniLRUCache {
    public static void main(String[] args) {
        MiniLRUCache<Integer,String> miniLRUCache = new MiniLRUCache<>();
        System.out.println("miniLRUCache: " + miniLRUCache);

        miniLRUCache.put(2,"Знание");
      //  miniLRUCache.put(3,"История");
    //    miniLRUCache.put(1,"Возврат");
        System.out.println("miniLRUCache after put: " + miniLRUCache);

        miniLRUCache.put(2,"Иное");
        System.out.println("miniLRUCache after put: " + miniLRUCache);
        System.out.println("get(2): " + miniLRUCache.get(2));

        while (miniLRUCache.getSize() > 0){
            System.out.println("miniLRUCache remove: " + miniLRUCache.remove());
            System.out.println("miniLRUCache: " + miniLRUCache);
        }
        System.out.println("miniLRUCache space: " + miniLRUCache);


    }
}
