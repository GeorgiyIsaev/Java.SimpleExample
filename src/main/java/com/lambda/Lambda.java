package com.lambda;

// Лямбда - анонимная функция (функция без названия)
// Любые интерфейсы с одним методом могут быть
// реализованы с помощью лямбда выражения
// (аргументы) -> {Код; Код;}
public class Lambda {
    public static void main(String[] args) {
        test01();
        test02();


    }

    public static void test01(){
        //не лямбда - Анонимный класс
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Поток");
            }
        });
        thread.start();
    }
    public static void test02(){
        //Передача с помощью лямбды - Java 8
        // анонимная функция
        Thread thread = new Thread(() -> System.out.println("Поток"));
        thread.start();
    }

    public static void test03(){
        //Три способа передать реализацию интерфейса
        Runner runner = new Runner();
        runner.run(new ExecutableImplementation());
        runner.run(new Executable() {
            @Override
            public void execute() {
                System.out.println("Hello 2");
            }
        });
        runner.run(() -> System.out.println("Hello 3"));
    }
}



interface Executable {
    void execute();
}

class Runner {
public void run(Executable e){

}
}
class ExecutableImplementation implements Executable{
    @Override
    public void execute() {
        System.out.println("Hello");
    }
}
