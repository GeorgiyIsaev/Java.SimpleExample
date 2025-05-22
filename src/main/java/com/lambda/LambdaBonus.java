package com.lambda;

public class LambdaBonus {
    public static void main(String[] args) {
        test01();
        test02();
    }

    public static void test01(){
        RunnerB runnerB = new RunnerB();

        final int bonus = 1000;
        //Передаваемая переменная (bonus) должна быть либо final
        // либо не менять во время работы приложения
        // Область видимости общая
        runnerB.run((value1, value2) -> {
            int result =  value1 + value1 + bonus;
            System.out.println(result);
            return result;
        });
    }
    public static void test02(){
        //У метода анонимного класса своя область видимости
        RunnerB runnerB = new RunnerB();

        final int bonus = 1000;
        runnerB.run(new ExecutableB() {
            @Override
            public int execute(int value1, int value2) {
                int bonus = 9;
                int result = value1 + value1 +bonus;
                System.out.println(bonus + " "+ result);
                return result;
            }
        });
    }

}
interface ExecutableB {
    int execute(int value1, int  value2);
}

class RunnerB {

    public void run(ExecutableB e){
       int result =  e.execute(1, 2);
        System.out.println("конец" + result);

    }
}