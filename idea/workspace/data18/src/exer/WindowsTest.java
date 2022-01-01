package exer;

/**
 * 买票的操作 线程安全问题
 *
 * @author gjx
 * @create 2021-11-30 16:49
 */

class window extends Thread {
    private static int total = 100;

    @Override
    public void run() {
        while (true) {
            if (total > 0) {
                System.out.println(getName() + "票号为：" + total);
                total--;
            }else{
                break;
            }
        }
    }
}


public class WindowsTest {
    public static void main(String[] args) {

        window w1 = new window();
        window w2 = new window();
        window w3 = new window();

        w1.setName("窗口一:");
        w2.setName("窗口二:");
        w3.setName("窗口三:");

        w1.start();
        w2.start();
        w3.start();

    }

}
