package data_11_8;

public class primfenNumber_1 {
	public static void main (String[] arge){
	
		boolean b = true;//������ʾ����������Ƿ�Ϊ����
		
		for(int i = 2;i <= 100;i ++){//100�������ı���
            //�ж����Ƿ�Ϊ����
		for(int j = 2;j < i;j ++){
			if(i % j == 0){
				b = false;
			}
		}
		if(b){//���bΪtrue�������i
			System.out.println(i);
		}
		b = true;//���ж���һ����֮��b��ֵ���¸���true
	}
}
}
