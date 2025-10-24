public class MetodosThread {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            try { Thread.sleep(2000); } catch (Exception e) {}
            System.out.println("Hilo terminado");
        });

        t.setName("MiHilo");
        System.out.println("Nombre: " + t.getName());

        t.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Prioridad: " + t.getPriority());

        t.start();

        System.out.println("¿Vivo?: " + t.isAlive());

        t.join(); // espera a que acabe
        System.out.println("¿Vivo tras join?: " + t.isAlive());
    }
}
