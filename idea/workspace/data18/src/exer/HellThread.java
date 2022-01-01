package exer;

/**
 * /**
 * 测试Thread中的常用方法：
 * 1. start():启动当前线程；调用当前线程的run()
 * 2. run(): 通常需要重写Thread类中的此方法，将创建的线程要执行的操作声明在此方法中
 * 3. currentThread():静态方法，返回执行当前代码的线程
 * 4. getName():获取当前线程的名字
 * 5. setName():设置当前线程的名字
 * 6. yield():释放当前cpu的执行权
 * 7. join():在线程a中调用线程b的join(),此时线程a就进入阻塞状态，直到线程b完全执行完以后，线程a才
 * 结束阻塞状态。
 * 8. stop():已过时。当执行此方法时，强制结束当前线程。
 * 9. sleep(long millitime):让当前线程“睡眠”指定的millitime毫秒。在指定的millitime毫秒时间内，当前
 * 线程是阻塞状态。
 * <p>
 * getPriority() ：返回线程优先值
 * setPriority(int newPriority) ：改变线程的优先级
 *
 * @author gjx
 * @create 2021-11-30 15:57
 */
class HelloThread1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(getName() + ":" + Thread.currentThread().getPriority() + " " + i);

            }


//            try {
////                让当前线程“睡眠”指定的millitime毫秒。在指定的millitime毫秒时间内，当前
////                        *                          线程是阻塞状态。
//                sleep(1);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }


//            //释放当前cpu的执行权
//            if(i%20==0){
//                yield();
//            }
        }


    }

    //构造器给线程命名
    public HelloThread1(String name) {
        super(name);
    }
}


public class HellThread {

    public static void main(String[] args) {

        HelloThread1 h1 = new HelloThread1("thread:1!");
        //起名的使用
//        h1.setName("线程一！");
        h1.start();
        //设置最高优先级
        h1.setPriority(Thread.MAX_PRIORITY);
        //主线程命名
        Thread.currentThread().setName("主线程");
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + Thread.currentThread().getPriority() + "  " + i);
            }
            //优先级设置
//            if(i==20){
//                try {
//                    //在线程a中调用线程b的join(),此时线程a就进入阻塞状态，直到线程b完全执行完以后，线程a才
//                    // *           结束阻塞状态。
//                    h1.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
        }

        //h1.是否存活
        System.out.println(h1.isAlive());
    }

}

