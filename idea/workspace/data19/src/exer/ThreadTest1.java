package exer;

/**
 * * 创建多线程的方式二：实现Runnable接口
 * 1. 创建一个实现了Runnable接口的类
 * 2. 实现类去实现Runnable中的抽象方法：run()
 * 3. 创建实现类的对象
 * 4. 将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
 * 5. 通过Thread类的对象调用start()
 * <p>
 * 多线程的创建 方式一
 * 1.创建一个继承于Thread的子类
 * 2.重写Thread类的run() 并声明在run中
 * 3.创建Thread的子类的对象
 * 4.通过对象调用子类
 *
 * @author gjx
 * @create 2021-12-01 9:55
 */


class testnTread1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {

            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() +":"+ i);
            }

        }
    }
}


class testnThread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() +":"+ i);
            }
        }

    }
}


public class ThreadTest1 {

    public static void main(String[] args) {
        testnTread1 test1 = new testnTread1();
        test1.setName("线程一");
        test1.start();

        testnThread2 test2 = new testnThread2();
        Thread test3 = new Thread(test2);
        test3.setName("线路二");
        test3.start();

    }

}
