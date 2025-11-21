public class Task3 {

    static class Counter {
        int value = 0;
        void inc() {
            value++;
        }
    }

    public static void main(String[] args) throws Exception {

        for (int run = 1; run <= 5; run++) {

            Counter counter = new Counter();

            Thread[] workers = new Thread[4];
            for (int i = 0; i < 4; i++) {
                workers[i] = new Thread(() -> {
                    for (int j = 0; j < 25000; j++) counter.inc();
                });
            }

            for (Thread t : workers) t.start();
            for (Thread t : workers) t.join();

            System.out.println("Run " + run + ": " + counter.value);
        }
    }
}


