package data23.exer3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/** collecions 测试
 * @author gjx
 * @create 2021-12-12 20:18
 */
public class collectionsTest {
    @Test
    public void test1(){
        List coll = new ArrayList();
        coll.add(123);
        coll.add(345);
        coll.add(567);
        coll.add(456);
        coll.add(567);
        coll.add(234);
        coll.add(567);

        //随机化
        Collections.shuffle(coll);
        System.out.println(coll);
        //排序
        Collections.sort(coll);
        System.out.println(coll);

        //反转数组
        Collections.reverse(coll);
        System.out.println(coll);
        //交换位置
        Collections.swap(coll,1,2);
        System.out.println(coll);
        //最大值，最小值
        Comparable max = Collections.max(coll);
        System.out.println(max);

        //指定元素出现的次数  找不到返回0
        int frequencyNumber = Collections.frequency(coll, 567);
        System.out.println(frequencyNumber);

        //replaceAll 使用新值替换
        Collections.replaceAll(coll,567,777);
        System.out.println(coll);

    }
    @Test
    public void test2(){
        List coll = new ArrayList();
        coll.add(123);
        coll.add(345);
        coll.add(567);
        coll.add(456);
        coll.add(234);
        Collections.sort(coll);
        //复制集合  copy(list desc,list src)  将src复制到desc中

        //aslist 表示将指定的元素存入数组
        //new boject[coll.size()] 表示创建一个长度为 coll.size 的object集合 默认为null
        List desc=Arrays.asList(new Object[coll.size()]);
        System.out.println(desc);
        Collections.copy(desc,coll);
        System.out.println(desc);

        //切记不可以直接加 会报错！！！！
        ArrayList arrayList = new ArrayList(coll.size());
        //Source does not fit in dest
        System.out.println(arrayList.size());
//        Collections.copy(arrayList,coll);
        System.out.println(arrayList);


    }
}
