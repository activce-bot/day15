/*
 * 100�ڵ�������ӡ
 */
package data_11_8;

import java.awt.font.NumericShaper.Range;

public class PrimeNumber2 {
	public static void main (String[] arge){
		
		int tmp=0;
		long start = System.currentTimeMillis();//��ʼ������
		//����100���ڵ���
	label: for(int i=2;i<=100;i++) {
			//�ж��Ƿ�Ϊ����
			//�Ż���  j<=Math.sqrt(i)  9592  9657
			for(int j=2;j<=Math.sqrt(i);j++){
				if(i % j == 0) {
					continue label; 
				}
			}//��������������Ӹ���
				
			tmp++;
			} 
		
		long end = System.currentTimeMillis();//�ٴλ�ȡ��ǰ�ۼƺ�����
		System.out.println("�����ѵ�ʱ��Ϊ" + (end - start) + "����");
		System.out.println("����Ϊ"+tmp);
		
}		
}
