package data.exer;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 银行有一个账户。
 * 有两个储户分别向同一个账户存3000元，每次存1000，存3次。每次存完打
 * 印账户余额。
 * 问题：该程序是否有安全问题，如果有，如何解决？
 * 【提示】 1，明确哪些代码是多线程运行代码，须写入run()方法
 * 2，明确什么是共享数据。
 * 3，明确多线程运行代码中哪些语句是操作共享数据的
 *
 * @author gjx
 * @create 2021-12-02 10:42
 */


class account {

    public double balance;

    //构造器，初始化余额
    public account(double balance) {
        this.balance = balance;
    }

     //synchronized
    public  void   deposit(double amt) {
        if (amt > 0) {
            balance += amt;

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + ":存钱成功。余额为：" + balance);
        }
    }
}


class custer extends Thread {
    //使用继承，需要加上静态，这样就为同一个对象
    private static ReentrantLock lock = new ReentrantLock(true);

    public account acct;

    public custer(account acct) {
        this.acct = acct;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                lock.lock();
                acct.deposit(1000);
            } finally {
                lock.unlock();
            }
        }
    }
}
public class AccountTest {
    public static void main(String[] args) {
        account acct = new account(0);
        custer t1 = new custer(acct);
        custer t2 = new custer(acct);
        t1.setName("甲");
        t2.setName("乙");
        t1.start();
        t2.start();
    }
}
