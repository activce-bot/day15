/*
 * ��ͥ��֧ϵͳ
 *    �򵥵�û���Ŵ�ѡ��
 *    
 *    ���������� ��ע  ֻ�����ֿ�������
 */

package data_11_8;

import java.util.Scanner;


public class whele_true {
	public static void main (String[] args) {
		
		Scanner scan =new Scanner(System.in);
		//ʵ����scanner
	
		
		String dataall="";
		//��Ϣ���
		int balance=1000;
		//��ʼ�����
	lable: while(true){
			System.out.println("<------����һ����֧ϵͳ------>");
			System.out.println("********1.�鿴��Ϣ********");
			System.out.println("********2.�������********");
			System.out.println("********3.֧�����********");
			System.out.println("********4.�˳�ϵͳ********\n");
			System.out.println("������1-4 :");
			System.out.println("-----------------------------");
			
			int catid =scan.nextInt();
			
			while(catid==1) {
				System.out.println("--------��ǰ��֧ϸ��-------------");
				System.out.println("��֧ \t�˻���� \t��֧��� \t��    ע\n");
				System.out.println(dataall);
				
				break;
			}
			
			while(catid==2) {
				System.out.println("������֧���:");
				int money = scan.nextInt();
				System.out.println("������֧˵��:");
				String info =scan.next();
				
				//����balance
				balance+=money;
				
				//����dataall
				dataall +="����\t"+balance+"\t"+money+"\t"+info+"\n";
				//
				System.out.println("-----------�Ǽǳɹ�-------------");
				
				//System.out.println("2......");
				break;
			}
			
			while(catid==3) {
				System.out.println("����֧�����:");
				int Money = scan.nextInt();
				System.out.println("������֧˵��:");
				String Info =scan.next();
				
				//
				balance-=Money;
				//����dataall
				dataall +="֧��\t"+balance+"\t"+Money+"\t"+Info+"\n";
				System.out.println("-----------�Ǽǳɹ�-------------");
				//System.out.println("3.......");
				break;
			}
			
			while(catid==4) {
//				System.out.println("�Ƿ�ȷ���˳��� ����y��n");
//				int Id =scan.nextInt();
//				char ynid=(char)Id;
//					if('y'==ynid) {
//						break lable;
//					}else {
//						System.out.println("         ��������ȷ����ֵ\n");
//						
//					}
				
				
				System.out.println("*********�Ѿ��˳�ϵͳ*******");
				break lable;
			}
			//System.out.println("         ��������ȷ����ֵ\n");
		}
	
	}
}
