class Worker1 extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("[" + getName() + "] preparando...");
            try { Thread.sleep(150); } catch (InterruptedException e) {}
        }
    }
}
