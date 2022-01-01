package data.exer;

/**
 * /**
 * 线程通信的例子：
 * 使用两个线程打印 1-100。线程1, 线程2 交替打印
 * 涉及到的三个方法：
 * wait():一旦执行此方法，当前线程就进入阻塞状态，并释放同步监视器。
 * notify():一旦执行此方法，就会唤醒被wait的一个线程。如果有多个线程被wait，    就唤醒优先级高的那个。
 * notifyAll():一旦执行此方法，就会唤醒所有被wait的线程。
 * 说明：
 * 1.wait()，notify()，notifyAll()三个方法必须使用在同步代码块或同步方法中。
 * 2.wait()，notify()，notifyAll()三个方法的  调用者   必须是同步代码块或同步方法中的同步监视器。
 * 否则，会出现IllegalMonitorStateException异常
 * 3.wait()，notify()，notifyAll()三个方法是定义在java.lang.Object类中。
 *
 * @author gjx
 * @create 2021-12-02 14:53
 */

class communt implements Runnable {

    private int number = 1;
    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                //设置启动其他线程
                notify();
                if (number <= 100) {

                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number++;

                    try {
                        //设置停止线程
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
        }
    }
}

public class communication {

    public static void main(String[] args) {
        communt co = new communt();
        Thread t1 = new Thread(co);
        Thread t2 = new Thread(co);

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();

    }
}
