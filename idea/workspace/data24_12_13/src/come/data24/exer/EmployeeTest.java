package come.data24.exer;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author gjx
 * @create 2021-12-12 14:28
 */

/**
 * 测试类 使用泛型
 */
public class EmployeeTest {
    /**
     * 使 Employee 实现 Comparable 接口，并按 name 排序
     * 泛型的使用
     */
    @Test
    public void Test1() {
        TreeSet<Employee> treeSet = new TreeSet<>();
        Employee a1 = new Employee("zhangxueyou", 45, new MyDate(1965, 5, 10));
        Employee a2 = new Employee("guofucheng", 40, new MyDate(1970, 3, 21));
        Employee a3 = new Employee("liming", 42, new MyDate(1967, 6, 6));
        Employee a4 = new Employee("xietingfeng", 35, new MyDate(1975, 8, 23));
        Employee a5 = new Employee("caixukun", 23, new MyDate(1995, 2, 21));

        treeSet.add(a1);
        treeSet.add(a2);
        treeSet.add(a3);
        treeSet.add(a4);
        treeSet.add(a5);
        //自动转换为泛型
        Iterator<Employee> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            Employee next = iterator.next();
            System.out.println(next);
        }

    }

    /**
     * 创建 TreeSet 时传入 Comparator 对象，按生日日期的先后排序
     */
    @Test
    public void test2() {
        TreeSet<Employee> treeSet = new TreeSet<>(new Comparator<Employee>() {
            //使用泛型
            @Override
            public int compare(Employee o1, Employee o2) {
                Employee e1 = (Employee) o1;
                Employee e2 = (Employee) o2;
                return e1.compareTo(e2);
            }
//            @Override
//            public int compare(Object o1, Object o2) {
//                if(o1 instanceof Employee && o2 instanceof Employee){
//                    Employee e1=(Employee)o1;
//                    Employee e2=(Employee)o2;
//                    int minyear = e2.getBirthday().getYear() - e1.getBirthday().getYear();
//                    if(minyear!=0){
//                        return minyear;
//                    }
//                    int minMonth = e2.getBirthday().getMonth() - e1.getBirthday().getMonth();
//                    if(minMonth!=0){
//                        return minMonth;
//                    }
//                    int minday = e2.getBirthday().getDay() - e1.getBirthday().getDay();
//                    if(minday!=0){
//                        return minday;
//                    }
//                    //出身年月日一样 比较名字
////                    System.out.println(e2.getName().compareTo(e2.getName()));
////                    return e2.getName().compareTo(e2.getName());
//                }
//                return 0;
//            }
        });
        Employee a1 = new Employee("zhangxueyou", 45, new MyDate(1965, 5, 10));
        Employee a3 = new Employee("liming", 42, new MyDate(1967, 6, 6));
        Employee a2 = new Employee("guofucheng", 40, new MyDate(1975, 8, 23));
        Employee a4 = new Employee("xietingfeng", 35, new MyDate(1975, 8, 21));
        Employee a5 = new Employee("caixukun", 23, new MyDate(1995, 2, 21));

        treeSet.add(a1);
        treeSet.add(a2);
        treeSet.add(a3);
        treeSet.add(a4);
        treeSet.add(a5);
        System.out.println(treeSet);
    }

}
