/*
 * ������ӡ
 */
package data6_11_9;

public class primeNumber {
	 
	public static void main(String[] args) {
		
		boolean tmp=true;
		//��ʾ�����Ƿ�Ϊ����
		// TODO Auto-generated method stub
		for(int i=2;i<=100;i++) {
			
		table:for(int j = 2;j<i;j++) {
			//�ж��Ƿ�Ϊ����
			//������ʾ��������
			if(i % j == 0) {
					tmp=false;
					break;
			}
			//������ľͶ��������ˣ��Խ��������
				if(tmp==true) {
					System.out.println(i);
					break table;
				}
				//����tmp
				tmp=true;
			}
		
		}
	}
}
