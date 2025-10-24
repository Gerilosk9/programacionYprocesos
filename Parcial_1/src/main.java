public class main {
    public static void main(String[] args) {
        TrabajadorA tA = new TrabajadorA();
                tA.setName("A");

                Thread tB = new Thread(new TrabajadorB("B"));
                tA.start();
                tB.start();
                try{
                    tA.join();
                    tB.join();
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
        System.out.println("Fin A");

        TrabajadorA tA2 = new TrabajadorA();
        tA.setName("A2");

        Thread tB2 = new Thread(new TrabajadorB("B2"));
        tA2.start();
        tB2.start();
        try{
            tA2.join(250);
            tB2.join(250    );
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Fin B");

    }
}
