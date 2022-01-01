package data21.exer2;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 自定义排序 compare
 * 自然排序
 *
 * @author gjx
 * @create 2021-12-08 10:32
 */

public class compareTest {
    public static void main(String[] args) {
        //使用数组进行排序
        String[] data = new String[]{"aa", "BB", "ee", "cc", "dd"};
        Arrays.sort(data);
        //使用toString 直接输出data
        System.out.println(Arrays.toString(data));
    }

    //对于自定义类，我们需要重写自定义类的方法Comparable
    //对自定义类的方法comple 重写
    @Test
    public void TestGoods() {

        Goods[] goods = new Goods[6];
        goods[0] = new Goods("xiaomi0", 30);
        goods[1] = new Goods("xiaomi1", 40);
        goods[2] = new Goods("xiaoom20", 20);
        goods[3] = new Goods("xiaoom2", 20);
        goods[4] = new Goods("xiaoom3", 10);
        goods[5] = new Goods("xiaoom30", 10);

        Arrays.sort(goods);
        System.out.println(Arrays.toString(goods));

        //java.lang.ClassCastException: data21.exer2.Goods cannot be cast to java.lang.Comparable

    }
    //  Comparator 定制排序  使用倒序排

    @Test
    public void TestComple() {
        String[] str = new String[]{"bb", "aa", "ee", "cc", "dd"};
        Arrays.sort(str, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //确定类型
                if (o1 instanceof String && o2 instanceof String) {
                    String str1 = (String) o1;
                    String str2 = (String) o2;
                    return -str1.compareTo(str2);
                }
                throw new RuntimeException("输入的数据类型不一致");
            }
        });
        System.out.println(Arrays.toString(str));
    }

    @Test
    public void TestComparato() {
        Goods[] goods = new Goods[6];
        goods[0] = new Goods("xiaomi0", 30);
        goods[1] = new Goods("xiaomi1", 40);
        goods[2] = new Goods("xiaoom2", 10);
        goods[3] = new Goods("xiaoom2", 20);
        goods[4] = new Goods("xiaoom3", 10);
        goods[5] = new Goods("xiaoom3", 20);

        Arrays.sort(goods, new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                //确定类型
                if (o1 instanceof Goods && o1 instanceof Goods) {
                    //转换类型
                    Goods str1 = (Goods) o1;
                    Goods str2 = (Goods) o2;
                    //名字相同 比较价格
                    if (str1.getName().equals(str2.getName())){

                        return -Double.compare(str1.getPrice(), str2.getPrice());
                    } else {
                        //不同比较大小
                        return str1.getName().compareTo(str2.getName());
                    }
                }
                throw new RuntimeException("传入的数据异常");
            }
        });
        System.out.println(Arrays.toString(goods));

    }

}
