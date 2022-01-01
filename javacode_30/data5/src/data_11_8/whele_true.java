/*
 * 家庭收支系统
 *    简单的没有排错选项
 *    
 *    ！！！输入 备注  只有数字可以运行
 */

package data_11_8;

import java.util.Scanner;


public class whele_true {
	public static void main (String[] args) {
		
		Scanner scan =new Scanner(System.in);
		//实例化scanner
	
		
		String dataall="";
		//信息存放
		int balance=1000;
		//初始化金额
	lable: while(true){
			System.out.println("<------这是一个收支系统------>");
			System.out.println("********1.查看信息********");
			System.out.println("********2.收入添加********");
			System.out.println("********3.支出添加********");
			System.out.println("********4.退出系统********\n");
			System.out.println("请输入1-4 :");
			System.out.println("-----------------------------");
			
			int catid =scan.nextInt();
			
			while(catid==1) {
				System.out.println("--------当前收支细明-------------");
				System.out.println("收支 \t账户金额 \t收支金额 \t备    注\n");
				System.out.println(dataall);
				
				break;
			}
			
			while(catid==2) {
				System.out.println("本次收支金额:");
				int money = scan.nextInt();
				System.out.println("本次收支说明:");
				String info =scan.next();
				
				//处理balance
				balance+=money;
				
				//处理dataall
				dataall +="收入\t"+balance+"\t"+money+"\t"+info+"\n";
				//
				System.out.println("-----------登记成功-------------");
				
				//System.out.println("2......");
				break;
			}
			
			while(catid==3) {
				System.out.println("本次支出金额:");
				int Money = scan.nextInt();
				System.out.println("本次收支说明:");
				String Info =scan.next();
				
				//
				balance-=Money;
				//处理dataall
				dataall +="支出\t"+balance+"\t"+Money+"\t"+Info+"\n";
				System.out.println("-----------登记成功-------------");
				//System.out.println("3.......");
				break;
			}
			
			while(catid==4) {
//				System.out.println("是否确认退出！ 输入y或n");
//				int Id =scan.nextInt();
//				char ynid=(char)Id;
//					if('y'==ynid) {
//						break lable;
//					}else {
//						System.out.println("         请输入正确的数值\n");
//						
//					}
				
				
				System.out.println("*********已经退出系统*******");
				break lable;
			}
			//System.out.println("         请输入正确的数值\n");
		}
	
	}
}
