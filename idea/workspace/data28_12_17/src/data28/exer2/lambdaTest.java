package data28.exer2;

/**
 * lambda 的使用
 *
 * @author gjx
 * @create 2021-12-17 19:05
 */

import org.junit.Test;

import java.util.Comparator;

/**
 * ->
 * 箭头左边写形参  右边写方法体
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * 使用规范，接口只有一个方法才行
 * 总结：
 * ->左边：lambda形参列表的参数类型可以省略(类型推断)；如果lambda形参列表只有一个参数，其一对()也可以省略
 * ->右边：lambda体应该使用一对{}包裹；如果lambda体只有一条执行语句（可能是return语句），省略这一对{}和return关键字
 */
public class lambdaTest {
    public static void main(String[] args) {
        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println("你在干什么？");
            }
        };
        run.run();
    }

    @Test
    public void test1() {
        Runnable run1 = () -> System.out.println("我在看书！！");
        run1.run();
    }

    @Test
    public void test2() {
        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        int compare = comp.compare(11, 12);
        System.out.println(compare);
        //类型推断！！！，
        //写入为integer 类型的，形参列表也是对于类型的，可以不写
        Comparator<Integer> comp1 = (o1, o2) -> o1.compareTo(o2);

        int compare1 = comp1.compare(12, 11);

        System.out.println(compare1);
        System.out.println("*******************");
        //包装类的比较
        Comparator<Integer> comp2 = (o1, o2) -> Integer.compare(o1, o2);

        int compare2 = comp2.compare(12, 11);

        System.out.println(compare2);

    }
    //方法体有多条语句时,大括号和return 都不可以省！！
    @Test
    public void test3(){
        Comparator<Integer> comp=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println(o1);
                System.out.println(o2);
                return Integer.compare(o1,o2);
            }
        };
        comp.compare(12,13);

        System.out.println("******************");
        Comparator<Integer> comp1=(o1,o2) ->{
            System.out.println(o1);
            System.out.println(o2);
            return Integer.compare(o1,o2);
        };
        comp1.compare(12,13);
    }
}


