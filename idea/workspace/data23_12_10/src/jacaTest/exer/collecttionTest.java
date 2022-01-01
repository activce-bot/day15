package jacaTest.exer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @create 2021-12-10 12:06
 * @author gjx
 */
public class collecttionTest {
    @Test
    public void test1() {
        Collection coll1 = new ArrayList();
        //添加元素
        coll1.add("13");
        coll1.add(new String("name"));
        coll1.add(new Person("jjj", 18));
        coll1.add(false);

        //是否为空
        System.out.println(coll1.isEmpty());
        //集合个数
        System.out.println(coll1.size());
        //清空集合的元素
        coll1.clear();
        System.out.println(coll1.size());
    }

    @Test
    public void test2() {
        Collection coll1 = new ArrayList();
        //        //添加元素
        coll1.add("13");
        coll1.add(new String("name"));
        coll1.add(new Person("jjj", 18));
        coll1.add(false);

        //是否为空
        System.out.println(coll1.isEmpty());
        //清空集合的元素
        System.out.println(coll1);
        Collection coll2 = new ArrayList();
        coll2.add(123);
        coll2.add(456);
        coll2.add(789);
        coll1.addAll(coll2);
        System.out.println(coll1);
        System.out.println(coll2);
        //contains 表示是否包含元素
        System.out.println(coll1.contains(123));
        //containsall 表示是否包含指定集合的所有元素
        System.out.println(coll1.containsAll(coll2));
        //remove 删除元素
        System.out.println(coll1.remove(new Person("jjj", 18)));
        System.out.println(coll1);
        //删除集合中包含的所有元素   去除 并 集合  去除指定集合中相同的元素
        coll1.removeAll(coll2);
        System.out.println(coll1);

    }

    //对于自定义的元素，我们需要重写其equals方法
    @Test
    public void test3() {
        Collection coll1 = new ArrayList();
        //添加元素
        coll1.add("13");
        coll1.add(new String("name"));
        coll1.add(new Person("jjj", 18));
        coll1.add(false);
        Collection coll2 = new ArrayList();

        coll2.add("13");
        coll1.add(new String("name"));
        coll1.add(new Person("jjj", 18));
        coll1.add(false);
        //        //添加元素
        //contains 表示是否包含指定的元素
        System.out.println(coll1.contains("13"));
        //arraylist有顺序！！！！！！！！！
        //containsall 表示是否包含指定集合的所有元素
        System.out.println(coll1.containsAll(coll2));

    }

    /**
     * iterator 迭代器的使用
     */
    @Test
    public void test4() {
        Collection coll1 = new ArrayList();
        //添加元素
        coll1.add("13");
        coll1.add(new String("name"));
        coll1.add(new Person("jjj", 18));
        coll1.add(false);
        //返回哈希值
        System.out.println(coll1.hashCode());

        Iterator iterator = coll1.iterator();
        //hasNext 返回是否还有元素
        while (iterator.hasNext()) {
            //next 返回元素
            System.out.println(iterator.next());

        }

    }

    @Test
    public void test5() {
        Collection coll1 = new ArrayList();

        //添加元素
        coll1.add("13");
        coll1.add(new String("name"));
        coll1.add(new Person("jjj", 18));
        coll1.add(false);

        Iterator iter = coll1.iterator();

        //remove 的使用 需要在前面使用使用next 把指针下移 要不会报错
        //      iter.remove();//IllegalStateException
        while (iter.hasNext()) {
            Object obj = iter.next();
            if ("name".equals(obj)) {
                iter.remove();
            }
        }
        //遍历需要重新造一个迭代器
        iter = coll1.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

    }
}







