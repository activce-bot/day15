package data23.exer3;

import org.junit.Test;

import java.util.*;

/**
 * @author gjx
 * @create 2021-12-12 18:37
 */
public class hashMaPeTest {
    @Test
    public void test1() {
        HashMap map = new HashMap();
        //添加
        map.put("zhangxueyou", 89);
        map.put("liming", 85);
        map.put("xietingfeng", 70);
        map.put("guofucheng", 80);
        //修改
        map.put("zhangxueyou", 77);
        System.out.println(map);
        //删除
        Object test = map.remove("liming");
        System.out.println(test);
        //查找指定位置的元素
        Object zhangxuyou = map.get("zhangxueyou");
        System.out.println(zhangxuyou);
        System.out.println(map.size());
        //无排序
        //hashmap无顺序

        map.put("zzzzzzzz", null);
        //对应的map是否为空
        System.out.println(map.isEmpty());
        System.out.println("**********************");

        //遍历
        // keyset()  遍历key值
        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println("key is:" + iterator.next());
        }
        //方式二
        for (Object o : set) {
            System.out.println("key is (for each):" + o);
        }
        //values() 遍历value  方式一
        Collection values = map.values();
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            System.out.println("value is:" + iterator1.next());
        }
        //get()    方式二
        System.out.println("*****************");
        iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println("value is:" + map.get(iterator.next()));
        }

        System.out.println(" ********获取排序方式一***********");
        //entrySet()   遍历key 和value 方式一

        Set entrySet = map.entrySet();
        Iterator iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {

//            //接收next  为obj类型
//            Object obj= iterator2.next();
//            //转换为map.entry
//            Map.Entry mEntry=(Map.Entry)obj;

            //一步到位
            Map.Entry mEntry = (Map.Entry) iterator2.next();
            //使用Map.Entry 里面的getKey 和 getValue 获取值
            System.out.println("key is:" + mEntry.getKey() + "\t\tvalues is:" + mEntry.getValue());
        }
        System.out.println(" ********获取排序方式二***********");
        //方式二 使用可以keyset 和 get获取value
        Set set1 = map.keySet();
        Iterator iterator3 = set1.iterator();
        while (iterator3.hasNext()) {
            System.out.print("key is:" + iterator3.next() + "\t");
        }
        System.out.println();
        iterator3 = set1.iterator();
        while (iterator3.hasNext()) {
            System.out.print("value is:" + map.get(iterator3.next()) + "\t\t\t");
        }
    }

    /**
     * 使用 Map.Entry 来调用getkey 和 getvalue
     *
     */
    @Test
    public void test2() {
        HashMap map = new HashMap();
        map.put("zhangxueyou", 89);
        map.put("liming", 85);
        map.put("xietingfeng", 70);
        map.put("guofucheng", 80);
        Set entrySet = map.entrySet();
        Iterator iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            Object next = iterator2.next();
            //转换为Map.Entry 类
            Map.Entry entry=(Map.Entry)next;
            Object value = entry.getValue();
            Object key = entry.getKey();
            System.out.println(value+"----->"+key);

        }
    }
}

