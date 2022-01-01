package come.data24.exer1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gjx
 * @create 2021-12-13 17:58
 */

public class GenericTest {

    /**
     * 泛型方法的使用
     */
    @Test
    public void test1() {

        GenericTest genericTest = new GenericTest();
        Integer[] str = new Integer[]{123, 345, 344};
        List<Integer> strings = genericTest.copFromArraylist(str);
        System.out.println(strings);
    }

    /**
     * 泛型在继承方面的使用，没有关系的不可以相互转换！！！！
     */
    @Test
    public void test2() {

        Object obj = null;
        String str = null;
        obj = str;

        List<Object> list1 = null;
        List<String> list2 = null;

        //不具有子父类的关系 ，无法自接赋值
        //G<a> 和G<b> 不具有子父类关系
//        list1=list2; //报错！！！

        //通配符的使用  ?  表示通配符 可以 转换后返回的类型为object的类型

        List<?> list = null;
        list = list1;
        list = list2;

        // 若 G 和F 为子父类关系
        //则 G<A> 和F<B>  具有子父类的关系


    }
    //泛型方法  可以声明为静态的
    //不管他类有有没有泛型，都和他所在类的泛型参数没有任何关系。
    public static <E> List<E> copFromArraylist(E[] arr) {
        ArrayList<E> list = new ArrayList<E>();
        for (E e : list) {
            list.add(e);
        }
        return list;
    }

}
