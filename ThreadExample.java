class MyThread extends Thread{

    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("thread  "+Thread.currentThread().getId()+" is running :"+i);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println("thread interrupted");
            }
        }
    }

}

public class ThreadExample {
    public static void main(String[] args){
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.start();
        thread2.start();

    }
}
