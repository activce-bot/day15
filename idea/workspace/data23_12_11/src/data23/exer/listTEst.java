package data23.exer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author gjx
 * @create 2021-12-11 14:35
 */
public class listTEst {
    //arraylist 和 linkedlist 继承与collectio

    @Test
    public void test() {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("GG");
        list.add(new personTest("jack", 17));
        list.add("MM");

        //使用迭代器   遍历
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("*************************");
        //增   添加指定元素到对于的位置
        list.add(3, new personTest("jary", 18));

        iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        // 查 对于自定义类型我们需要重写其tostring 方法
        System.out.println(list.get(3));

        System.out.println("********************");
        //返回456  数字类型的 需要使用包装类

//        System.out.println(list.get(456));//IndexOutOfBoundsException  空指针

        System.out.println(list.indexOf(new Integer(456)));

        //改  设置指定位置的元素
        list.set(0, 234);
        System.out.println(list.get(0));

        //删  对于删除有俩种方式  删索引位置  或者删去对应的包装类  new Integer(456)
        //list.remove(0);
        list.remove("GG");
        System.out.println(list.get(2));
        System.out.println("*****************for erch**************");
        for(Object o: list){
            System.out.println(o);
        }

        System.out.println(list);
    }
}
