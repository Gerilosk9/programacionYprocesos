class Paso extends Thread {
    int dur;
    Paso(String n, int d){ super(n); dur=d; }
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println("["+getName()+"] paso "+(i+1));
            try{Thread.sleep(dur/3);}catch(Exception e){}
        }
    }
}