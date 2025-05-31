
class MyRunnable implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Thread " +Thread.currentThread().getId() + "is running "+i);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class ThreadExample2{
    public static void main(String[] args){
        MyRunnable runnable = new MyRunnable();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();
    }
}