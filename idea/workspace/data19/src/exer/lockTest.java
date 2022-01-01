package exer;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 使用  ReentrantLock来调用lock锁解决线程安全问题
 * @author gjx
 * @create 2021-12-01 19:23
 */

class windows implements Runnable {

    private int tatal = 100;

    private ReentrantLock lock = new ReentrantLock(true);


    public void run() {
        while (true) {
            try {
                //调用lock
                lock.lock();
                if (tatal > 0) {
                    System.out.print(Thread.currentThread().getName() + tatal +"\t ");
                    tatal--;
                    if(tatal%9==0){
                        System.out.println();
                    }else{

                    }

                } else {
                    break;
                }
            }finally{
                //关闭lock
                lock.unlock();
            }
        }
    }
}

public class lockTest {
    public static void main(String[] args) {

        windows windos = new windows();

        Thread t1 = new Thread(windos);
        Thread t2 = new Thread(windos);
        Thread t3 = new Thread(windos);

        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");

        t1.start();
        t2.start();
        t3.start();

    }
}
