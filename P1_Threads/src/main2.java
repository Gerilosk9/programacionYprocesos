public class main2 {
    public static void main(String[] args) throws InterruptedException {

        Thread a = new Paso("A", 300);
        Thread b = new Paso("B", 1200);
        Thread c = new Paso("C", 700);
        a.start(); b.start(); c.start();
        a.join(); b.join(); c.join();
        System.out.println("[main] todos terminados");
    }
}


