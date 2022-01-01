package day12_28;

import org.junit.Test;

/**
 * @author gjx
 * @create 2021-12-28 20:49
 */
public class nineninetest {
    /**
     * 九九乘法表
     */
    @Test
    public void test1() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(String.format("%-7s", (i + "*" + j + "=" + (i * j))));
            }
            System.out.println();
        }
    }

    /**
     * 100质数输出
     */
    @Test
    public void test2() {

        boolean isTure = true;
        int total = 0;
        for (int i = 2; i <= 1000; i++) {
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isTure = false;
                    break;
                }
            }
            if (isTure) {
                total++;
                System.out.print(String.format("%-4s", i));

                if (total % 10 == 0) System.out.println();

            }
            isTure = true;
        }
        System.out.println();
        System.out.println("个数为:" + total);
    }
}
