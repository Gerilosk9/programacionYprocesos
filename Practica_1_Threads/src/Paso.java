class Paso extends Thread {
    private final int duration;

    Paso(String name, int duration) {
        super(name);
        this.duration = duration;
    }

    public void run() {
        for (int i = 0; i < duration / 100; i++) {
            System.out.println("[" + getName() + "] .");
            try { Thread.sleep(100); } catch (Exception e) {}
        }
    }
}
