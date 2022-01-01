package exer;

/**
 * 多线程的创建 方式一
 * 1.创建一个继承于Thread的子类
 * 2.重写Thread类的run() 并声明在run中
 * 3.创建Thread的子类的对象
 * 4.通过对象调用子类
 *
 * @author gjx
 * @create 2021-11-30 10:28
 */

//1.创建一个继承于Thread的子类
class MyThreadTest extends Thread {

    //2.重写Thread类的run() 并声明在run中
    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName()+"  "+i);
            }
        }

    }
}

public class ThreadTest {
    public static void main(String[] args) {
        //3.创建Thread的子类的对象
        MyThreadTest my = new MyThreadTest();
        //4.通过对象调用子类
        my.start();
        //start只可以使用一次，需要再次使用需要重新创建一个对象
//        my.start();
        MyThreadTest my1 = new MyThreadTest();
        my1.setName("线程一");
        my1.start();

        System.out.println("hello");
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName()+ "  "+i );
            }
        }
    }
}