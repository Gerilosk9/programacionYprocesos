public class Task2 {
    public static void main(String[] args) throws Exception {
        versionA();
        versionB();
    }

    static void versionA() throws Exception {
        System.out.println("");

        Thread a = new Paso("PasoA", 300);
        Thread b = new Paso("PasoB", 1200);
        Thread c = new Paso("PasoC", 700);

        a.start();
        b.start();
        c.start();

        a.join();
        b.join();
        c.join();

        System.out.println("main todos terminados (A).");
    }

    static void versionB() throws Exception {
        System.out.println("");

        Thread a = new Paso("PasoA", 300);
        Thread b = new Paso("PasoB", 1200);
        Thread c = new Paso("PasoC", 700);

        a.start();
        b.start();
        c.start();

        waitWithTimeout(a, 600);
        waitWithTimeout(b, 600);
        waitWithTimeout(c, 600);

        System.out.println("main Continuo (B).");
    }

    private static void waitWithTimeout(Thread t, long timeout) throws InterruptedException {
        t.join(timeout);
        if (t.isAlive()) {
            System.out.println("Timeout en " + t.getName() + ", continuo...");
        }
    }
}
