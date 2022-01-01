package data23.exer;

import java.util.Objects;

/**
 * @author gjx
 * @create 2021-12-11 14:41
 */
public class personTest {
    private String name;
    private int age;

    public personTest() {
    }

    public personTest(String name, int age) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        personTest that = (personTest) o;
        return age == that.age &&
                Objects.equals(name, that.name);
    }

    @Override
    public String toString() {
        return "personTest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
//    @Override
//    public int hashCode() {
//
//        return Objects.hash(name, age);
//    }
}
