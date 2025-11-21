public class Task1 {
    public static void main(String[] args) {

        System.out.println("[main] inicio");

        Thread t1 = new Worker1();
        t1.setName("Worker-1");

        Thread t2 = new Thread(new Worker2());
        t2.setName("Worker-2");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {}

        System.out.println("main fin");
    }
}
