public class main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("[main] inicio");

        Thread t1 = new Worker1();
        t1.setName("Worker-1");
        Thread t2 = new Thread(new Worker2(), "Worker-2");

        t1.start();
        t2.start();
        t1.join(); t2.join();

        System.out.println("[main] fin");
    }
}


