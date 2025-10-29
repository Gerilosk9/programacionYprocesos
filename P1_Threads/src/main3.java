public class main3 {
    public static void main(String[] args) throws InterruptedException {

                for(int r=1;r<=5;r++){
                    Counter c=new Counter();
                    Thread[] t=new Thread[4];
                    for(int i=0;i<4;i++){
                        t[i]=new Thread(()->{for(int k=0;k<25000;k++)c.inc();});
                        t[i].start();
                    }
                    for(Thread th:t) th.join();
                    System.out.println("Run "+r+" -> "+c.value);
                }
            }
        }

