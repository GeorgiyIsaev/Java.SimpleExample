package com.lambda;

public class LambdaReturn {
    public static void main(String[] args) {
        //Не указываем тип значения
        RunnerR runner = new RunnerR();
        runner.run(() -> {
            int sum = 2+2;
            sum+=11;
            return sum;
        });

        runner.run(new ExecutableImplementationR());

        //Если код в одну строку можно пропустить ретерн
        runner.run(() -> 2);
    }
}


interface ExecutableR {
    int execute();
}

class RunnerR {
    public void run(ExecutableR e){
        int result = e.execute();
        System.out.println("result " + result);
    }
}
class ExecutableImplementationR implements ExecutableR{
    @Override
    public int execute() {
        System.out.println("Hello");
        return 1000;
    }
}
