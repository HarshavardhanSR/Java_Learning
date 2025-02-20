class SharedResource{
    synchronized void printNumbers(){
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
class MyThread extends Thread {
    SharedResource resource;
    MyThread(SharedResource resource){
        this.resource = resource;
    }
    public void run(){
        resource.printNumbers();
    }
}
public class P20_SyncThreads {
        public static void main(String[] args) {
            SharedResource resource = new SharedResource();
            MyThread t1 = new MyThread(resource);
            MyThread t2 = new MyThread(resource);
            t1.start();
            t2.start();
        }
    }
