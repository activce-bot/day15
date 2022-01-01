package exer;

/**
 * @author gjx
 * @create 2021-11-30 11:20
 */

class MyThread extends Thread {


}

public class Threaddeam {
    public static void main(String[] args) {

        //匿名子类的使用
        new Thread() {
            //重写run方法
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + "  " + i);
                    }
                }

            }
        }.start();

        System.out.println("********");
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + "  " + i);
                    }
                }
            }
        }.start();
    }

}
