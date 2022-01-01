package exer;

/**
 * 买票系统
 *
 * @author gjx
 * @create 2021-11-30 17:29
 */

class windos1 implements Runnable {

    private int tatal = 100;

    @Override
    public void run() {
        while (true) {

            if (tatal > 0) {
                System.out.println(Thread.currentThread().getName() + tatal);
                tatal--;

            } else {
                break;
            }
        }

    }
}

public class WindosTest2 {
    public static void main(String[] args) {

        windos1 win = new windos1();
        Thread t1 = new Thread(win);
        Thread t2 = new Thread(win);
        Thread t3 = new Thread(win);

        t1.setName("线程一:");
        t2.setName("线程二:");
        t3.setName("线程三:");

        t1.start();
        t2.start();
        t3.start();
    }

}

