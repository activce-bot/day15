/*
 * 100�ڵ�������ӡ
 */
package data_11_8;
public class PrimeNumber {
	public static void main (String[] arge){
			
		int tmp=0;
		boolean number=  true;
		//��ʾ�Ƿ�Ϊ����
		long start = System.currentTimeMillis();//��ʼ������
		//����100���ڵ���
		for(int i=2;i<=100;i++) {
			//�ж��Ƿ�Ϊ����
			//�Ż���  j<=Math.sqrt(i)  9592  9657
			for(int j=2;j<=Math.sqrt(i);j++){
				if(i % j == 0) {
					number=false;
					break;
					//�Ż�1
				}
			}//��������������Ӹ���
				if(number){
					System.out.println(i);
					tmp++;
				}
				number=true;
			} 
		
		long end = System.currentTimeMillis();//�ٴλ�ȡ��ǰ�ۼƺ�����
		System.out.println("�����ѵ�ʱ��Ϊ" + (end - start) + "����");
		System.out.println("����Ϊ"+tmp);
		
		//���  18516   break1720    
}		//�����  18319       1671   103    16 
}
	
