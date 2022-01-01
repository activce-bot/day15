package data22.exer;

/** 枚举类实现接口
 * @author gjx
 * @create 2021-12-09 12:38
 */

/**
 * 实现接口的时候可以 统一设置重写方法，或者自定义每一个对象的方法
 */
public class enumTest2 {
    public static void main(String[] args) {
//        testEnum1 autumn = testEnum1.AUTUMN;
//        System.out.println(autumn);
//        autumn.show();
        testEnum1 summer = testEnum1.SUMMER;
        System.out.println(summer);
        summer.show();
        System.out.println("***********************");
        testEnum1[] vals = testEnum1.values();
        for (int i = 0; i < vals.length; i++) {
            System.out.println(vals[i]);
        }
    }
}

interface testEnumTest{

    public void show();

}

enum testEnum1  implements testEnumTest{
    //2.提供当前枚举类的对象 用","连接 ,使用";"结尾
    SPRING("春天", "春暖花开"){
        @Override
        public void show() {
            System.out.println("春天真好！");
        }
    },
    SUMMER("夏天", "夏日炎炎"){
        @Override
        public void show() {
            System.out.println("夏天真好！");
        }
    },
    AUTUMN("秋天", "3333"),
    WINTER("冬天", "4444");


    //1.写出需要的属性  使用private final ,  并提供对 私有化 构造器
    private final String testName;
    private final String testDesc;

    public String getTestName() {
        return testName;
    }

    public String getTestDesc() {
        return testDesc;
    }

    private testEnum1(String testName, String testDesc) {
        this.testName = testName;
        this.testDesc = testDesc;
    }

    @Override
    public String toString() {
        show();
        return "test1{" +
                "testName='" + testName + '\'' +
                ", testDesc='" + testDesc + '\'' +
                '}';
    }
    @Override
    public void show() {
        System.out.println("这是一个季节！");
    }
}