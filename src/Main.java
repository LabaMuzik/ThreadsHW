import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws Exception {

        System.out.println("Создаю потоки...");

        final ThreadGroup group = new ThreadGroup("Группа А");

        final Thread first = new MyThreadFirst (group,Thread.currentThread().getName());
        final Thread second = new MyThreadSecond (group,Thread.currentThread().getName());
        final Thread third = new MyThreadThird (group,Thread.currentThread().getName());
        final Thread fourth = new MyThreadFourth (group,Thread.currentThread().getName());

        first.start();
        second.start();
        third.start();
        fourth.start();

        Thread.sleep(15000);

        System.out.println("Завершаю все потоки...");

        group.interrupt();

    }
}
