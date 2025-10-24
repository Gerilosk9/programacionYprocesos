class Pares extends Thread {
    public void run() {
        for (int i = 2; i <= 20; i += 2) System.out.println("Par: " + i);
    }
}
