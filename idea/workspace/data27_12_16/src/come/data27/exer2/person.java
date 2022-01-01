package come.data27.exer2;

import java.io.Serializable;

/**
 * @author gjx
 * @create 2021-12-16 13:03
 */
public class person implements Serializable {
    private String name;
    private int age;
    private double  isMale;

    /**
     * //对于自定义类
     //需要对自定义类加上可序列化接口 Serializable 和加上序列化的id！！
     防止自定义类变化导致输出错误！！！！
     // 一般自接点击 string 类就可以获取
     //NotSerializableException

     */
    private static final long serialVersionUID = -68491237710L;

    public person() {
    }

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public person(String name, int age, double isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
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
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isMale=" + isMale +
                '}';
    }
}
