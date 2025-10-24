public class TrabajadorB implements Runnable {

    public TrabajadorB(String b) {
    }

    @Override
    public void run() {
        for (int i = 1; i<= 3; i++){
            System.out.println("B paso" +i);
                try{
                    Thread.sleep(200);
                }catch (InterruptedException e) {
                    e.printStackTrace();
            }
        }
    }
}
