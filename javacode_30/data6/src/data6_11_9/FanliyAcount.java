package data6_11_9;


public class FanliyAcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isFlag=true;
		//�Ƿ��˳�ѭ��
		
		String dataall="";
		//����ַ���
		
		int balance=1000;
		//��ʼ�����
		
		 while(isFlag){
				System.out.println("<------- ��ͥ��֧ϵͳ------->\n");
				System.out.println("        1.��֧��ϸ");
				System.out.println("        2.�Ǽ�����");
				System.out.println("        3.�Ǽ�֧��");
				System.out.println("        4.�˳�ϵͳ\n");
				System.out.println("������1-4 :");
			
				char selection= Utility.readMenuSelection();
				//��ȡѡ��
				switch(selection) {
				
				case '1':
					//System.out.println("-----------------------------");
					System.out.println("--------��ǰ��֧ϸ��-------------");
					System.out.println("��֧ \t�˻���� \t��֧��� \t��    ע\n");
					System.out.println(dataall);
					System.out.println("-----------------------------");
					break;
					
				case '2':
					System.out.println("������֧���:");
					int money = Utility.readNumber();
					System.out.println("������֧˵��:");
					String info =Utility.readString();
					
					//
					balance+=money;
					
					//����dataall
					dataall +="����\t"+balance+"\t"+money+"\t"+info+"\n";
					//
					System.out.println("-----------�Ǽǳɹ�-------------");
					
					//System.out.println("2.�Ǽ�����");
					break;
				case '3':
					System.out.println("����֧�����:");
					int Money = Utility.readNumber();
					System.out.println("������֧˵��:");
					String Info =Utility.readString();
					
					//
					balance-=Money;
					//����dataall
					dataall +="֧��\t"+balance+"\t"+Money+"\t"+Info+"\n";
					System.out.println("-----------�Ǽǳɹ�-------------");

					//System.out.println("3.֧��");
					break;
				case '4':
					
					
					//System.out.println("4.�˳��ɹ�");
					System.out.println("ȷ���Ƿ��Ƴ���y/n��");
					char isExit= Utility.readConfirmSelection();
					if(isExit=='Y') {
						
						isFlag=false;
						System.out.println("     �˳��ɹ�");
						
					}
					
				}
				
		 }
	}
}
