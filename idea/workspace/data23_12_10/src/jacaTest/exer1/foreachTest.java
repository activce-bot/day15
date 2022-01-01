package jacaTest.exer1;

import jacaTest.exer.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * for each 遍历
 *
 * @author gjx
 * @create 2021-12-10 15:22
 */

public class foreachTest {
    /**
     * for each 遍历
     */
    @Test
    public void test5() {
        Collection coll1 = new ArrayList();
        //添加元素
        coll1.add("13");
        coll1.add(new String("name"));
        coll1.add(new Person("jjj", 18));
        coll1.add(false);


        for (Object o : coll1) {
            System.out.println(o);
        }
        System.out.println("*************");

        //是把值赋给了o 所以coll1不变 !!!!!!!!!!!!!!!!!!!!!
        // 变量类型  ：变量   变量类型是由变量决定的
        for (Object o : coll1) {
            o = "13";
            System.out.println(o);
        }
        System.out.println(coll1);


        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        for (int o : arr) {
            System.out.print(o+" ");
        }
    }
}
