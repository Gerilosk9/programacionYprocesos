class Worker2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("[Worker-2] comprobando...");
            try { Thread.sleep(150); } catch (Exception e) {}
        }
    }
}
