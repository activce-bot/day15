package exer;

/**
 * 线程安全问题解决办法一
 * synchronized同步代码块
 *
 * @author gjx
 * @create 2021-12-01 11:21
 */

class windos1 implements Runnable {

    public int tatal = 100;
    //使用同一个对象
//    Object obj = new Object();

    @Override
    public void run() {
        //包住结构  同步代码块 不可以多不可以少
        while (true) {
            //this表示Windows1的对象，也为唯一
            synchronized (this) {
                if (tatal > 0) {

                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + tatal);
                    tatal--;
                } else {
                    break;
                }

            }

        }
    }
}


public class windosTesttt1 {
    public static void main(String[] args) {

        windos1 w1 = new windos1();
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
