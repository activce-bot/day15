package exer1;

public class InterfaceTest {
public static void main(String[] args) {
	
	ComparableCircle c1=new ComparableCircle(2.4);
	ComparableCircle c2=new ComparableCircle(2.5);
	
	//使用int 接收 因为定义为传入为浮点型的数
	int compareValue=c1.compareTo(c2);
	//int compareValue1=c1.compareTo(new String("123"));
	System.out.println(compareValue);
}
}
