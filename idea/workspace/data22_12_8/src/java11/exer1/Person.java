package java11.exer1;

/**
 * @author gjx
 * @create 2021-12-08 14:46
 */
public class Person implements Comparable {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}'+"\n";
    }
    //按姓名从小到大排序），
    @Override
    public int compareTo(Object o) {
        if (o instanceof Person) {
            Person per = (Person) o;
                if(this.getName()==per.getName()){
                //名字一样比较年龄大小
               return Double.compare(this.getAge(),per.getAge());
//                return 0;
            }else {
                return this.getName().compareTo(per.getName());
            }
        }
        throw new RuntimeException("输入的数据非法");
    }
}
