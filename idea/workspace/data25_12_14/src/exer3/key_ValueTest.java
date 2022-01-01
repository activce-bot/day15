package exer3;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author gjx
 * @create 2021-12-14 14:57
 */
public class key_ValueTest {
    /**
     * 使用泛型把key-value 输出
     */
    @Test
    public void test(){
        HashMap <Integer,String>map = new HashMap<>();
        map.put(123,"data20");
        map.put(111,"data21");
        map.put(222,"data22");
        map.put(333,"data23");
        map.put(444,"data24");

        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = entrySet.iterator();
        while(iterator.hasNext()){
            //转换为Map.Entry 类 ，在调用其getkey方法 和getvalues 方法
            Map.Entry entry= (Map.Entry)iterator.next();
            System.out.println("key is:"+entry.getKey()+"value is:"+entry.getValue());
        }

    }
}
