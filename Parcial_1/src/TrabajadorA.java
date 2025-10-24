public class TrabajadorA extends Thread {

    public void run(){
        for(int i = 1; i <=3; i++){
            System.out.println("A paso" + i);
            try{
                Thread.sleep(150);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
