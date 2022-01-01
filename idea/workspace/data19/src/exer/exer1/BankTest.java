package exer.exer1;

/**
 * 线程 安全 懒汉式 结局方案
 *
 * @author gjx
 * @create 2021-12-01 15:12
 */

class Bank {

    //私有化构造器
    private Bank() {
    }

    //初始化构造器
    private static Bank instace = null;

    //私有化方法
    private static Bank getInstace() {
        //方式一效率稍差
//        synchronized (Bank.class) {
//            if (instace == null) {
//                instace = new Bank();
//            }
//            return instace;
//        }
        //方式二
        if (instace == null) {
            synchronized (Bank.class) {
                if (instace == null) {
                    instace = new Bank();
                }
            }
        }
        return instace;
    }
}

public class BankTest {


}
