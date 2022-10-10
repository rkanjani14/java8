package tothenew;


class question3 {
    public static void main(String[] args) {
        Runnable threadRun = () -> {
            Thread.currentThread().setName("My Thread");
            System.out.println(Thread.currentThread().getName() + " is running");
        };
        Thread thread = new Thread(threadRun);
        thread.start();
    }
}