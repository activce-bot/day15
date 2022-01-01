package exer;

/**
 *   实现二  同步方法
 *   synchronized
 *
 * @author gjx
 * @create 2021-12-01 14:46
 */
class window2 implements Runnable {

    public int tatal = 100;

    @Override
    public void run() {
        while (true) {

            show();
        }
    }

    public synchronized void show() {
        if (tatal > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":" + tatal);
            tatal--;
        }


    }
}


public class windowTest2 {
    public static void main(String[] args) {

        window2 w1 = new window2();
        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w1);
        Thread t3 = new Thread(w1);

        t1.setName("线程一");
        t2.setName("线程二");
        t3.setName("线程三");

        t1.start();
        t2.start();
        t3.start();
    }


}

