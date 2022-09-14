class MyThreadFourth extends Thread {

    public MyThreadFourth(ThreadGroup threadGroup, String name) {
        super(threadGroup, name);
    }

    @Override
    public void run() {
        try {
            while(!isInterrupted()) {
                setName("Я поток 4");
                Thread.sleep(2500);
                System.out.println(Thread.currentThread().getName() + " Всем привет!");
            }
        } catch (InterruptedException err) {

        } finally{
            System.out.printf("%s завершен\n", Thread.currentThread().getName());
        }
    }
}