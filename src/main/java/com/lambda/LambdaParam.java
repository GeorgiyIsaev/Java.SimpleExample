package com.lambda;

public class LambdaParam {
    public static void main(String[] args) {

        RunnerP runner = new RunnerP();
        runner.run(new ExecutableImplementationP());

        runner.run(value -> {
            System.out.println("Value " + value);
            System.out.println("Value +5 " + (value+5));
        });

        runner.run(value -> System.out.println("Value " + value));

        //Два аргумента
        runner.run((value, str) -> System.out.println(str + " " + value));
    }
}

interface ExecutableP {
    void execute(int value);
}
interface ExecutablePP {
    void execute(int value, String str);
}

class RunnerP {
    public void run(ExecutableP e){
        e.execute(1000);
    }
    public void run(ExecutablePP e){
        e.execute(999,"Слово");
    }
}
class ExecutableImplementationP implements ExecutableP{
    @Override
    public void execute(int value) {
        System.out.println("Hello " + value);
    }
}
