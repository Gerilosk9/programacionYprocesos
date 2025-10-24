class MiPrimerHilo extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Ejecución del hilo: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("El hilo fue interrumpido");
        }
    }
}