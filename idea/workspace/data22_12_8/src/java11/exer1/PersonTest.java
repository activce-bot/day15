package java11.exer1;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author gjx
 * @create 2021-12-08 14:46
 */
public class PersonTest {
    @Test
    public void test() {
        Person[] per = new Person[6];
        per[0] = new Person("ddd", 18);
        per[1] = new Person("aaa", 17);
        per[2] = new Person("bbb", 19);
        per[3] = new Person("bbb", 16);
        per[4] = new Person("ccc", 19);
        per[5] = new Person("ccc", 16);
        Arrays.sort(per);
        System.out.println(Arrays.toString(per));
    }

    //定制排序
    @Test
    public void test1() {
        Person[] per = new Person[6];
        per[0] = new Person("ddd", 18);
        per[1] = new Person("aaa", 17);
        per[2] = new Person("bbb", 19);
        per[3] = new Person("bbb", 16);
        per[4] = new Person("ccc", 19);
        per[5] = new Person("ccc", 16);
        Arrays.sort(per, new Comparator() {
            @Override
            //的年龄从大到小排序   年龄一样的话比较姓名 从小到大
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Person && o2 instanceof Person) {
                    Person per1 = (Person) o1;
                    Person per2 = (Person) o2;
                    if (per1.getAge() == per2.getAge()) {
                        return per1.getName().compareTo(per2.getName());
                    } else {
                        //年龄一样的话比较姓名 从小到大
                        return -Double.compare(per1.getAge(), per2.getAge());
                    }
                }
                throw new RuntimeException("数据非法");
            }
        });

        System.out.println(Arrays.toString(per));
    }

}
