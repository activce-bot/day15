package dara6_1_11_10;

public class shusu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean ifFlag=true;
		//����iΪ����
		
		//����100���ڵ���
		for(int i=2;i<=100;i++) {
			
		table:for(int j=2;j<i;j++) {
			
			//�ж��Ƿ�Ϊ����
				if(i%j==0) {
					ifFlag=false;
					break ;
				}
				//���i
				if(ifFlag) {
					System.out.println(i);
					break table;
				}
				//����table
				ifFlag=true;
			}
		}
	}

}
