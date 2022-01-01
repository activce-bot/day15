package data22.exer;

/**
 * 枚举类的使用
 * 方法 toString  返回当前的对象名字
 * values() 返回当前枚举类的所有对象的数组  可以遍历
 * valuesof() 输入一个当前对象的名字 如果存在，则返回名字，不存在就报错。
 *
 * @author gjx
 * @create 2021-12-09 11:24
 */

public class
enumTest1 {
    public static void main(String[] args) {
        testEnum autumn = testEnum.SUMMER;

        System.out.println(testEnum.class.getSuperclass());
        //父类为 class java.lang.Enum
        //toString 方法不同  默认输出对应的对象名字  可以重写toString方法
        System.out.println(autumn);//AUTUMN
        System.out.println("************************");
        //values()
        testEnum[] values = testEnum.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
        //valuesof（）
        testEnum spring = testEnum.valueOf("SPRING");
//        testEnum spring = testEnum.valueOf("SPRING1");//IllegalArgumentException
        System.out.println(spring);

    }
}

//枚举类的使用
enum testEnum {
    //2.提供当前枚举类的对象 用","连接 ,使用";"结尾  并把对象放在最前面
    SUMMER("夏天", "夏日炎炎"),
    SPRING("春天", "春暖花开"),
    WINTER("冬天", "4444"),
    AUTUMN("秋天", "3333");


    //1.写出需要的属性  使用private final ,  并提供对 私有化 构造器
    private final String testName;
    private final String testDesc;

    public String getTestName() {
        return testName;
    }

    public String getTestDesc() {
        return testDesc;
    }

    private testEnum(String testName, String testDesc) {
        this.testName = testName;
        this.testDesc = testDesc;
    }

    @Override
    public String toString() {
        return "test1{" +
                "testName='" + testName + '\'' +
                ", testDesc='" + testDesc + '\'' +
                '}';
    }
}
