class Worker2 implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();
        for (int i = 0; i < 3; i++) {
            System.out.println("[" + t.getName() + "] comprobando...");
            try { Thread.sleep(150); } catch (InterruptedException e) {}
        }
    }
}