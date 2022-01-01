package exer;

/**
 * @author gjx
 * @create 2021-12-01 15:06
 */
class window4 extends Thread {
    private static int total = 100;

    @Override
    public void run() {
        while (true) {

            show();
        }
    }


    private static synchronized void show() {
        if (total > 0) {
            System.out.println(Thread.currentThread().getName() + "票号为：" + total);
            total--;
        }

    }
}

public class windowTest4 {
    public static void main(String[] args) {

        window4 w1 = new window4();
        window4 w2 = new window4();
        window4 w3 = new window4();

        w1.setName("窗口一:");
        w2.setName("窗口二:");
        w3.setName("窗口三:");

        w1.start();
        w2.start();
        w3.start();

    }

}