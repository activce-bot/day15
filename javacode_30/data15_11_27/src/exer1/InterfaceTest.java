package exer1;

public class InterfaceTest {
public static void main(String[] args) {
	
	ComparableCircle c1=new ComparableCircle(2.4);
	ComparableCircle c2=new ComparableCircle(2.5);
	
	//ʹ��int ���� ��Ϊ����Ϊ����Ϊ�����͵���
	int compareValue=c1.compareTo(c2);
	//int compareValue1=c1.compareTo(new String("123"));
	System.out.println(compareValue);
}
}
