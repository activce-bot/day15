package data6_11_9;


public class FanliyAcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isFlag=true;
		//是否退出循环
		
		String dataall="";
		//输出字符串
		
		int balance=1000;
		//初始化金额
		
		 while(isFlag){
				System.out.println("<------- 家庭收支系统------->\n");
				System.out.println("        1.收支明细");
				System.out.println("        2.登记收入");
				System.out.println("        3.登记支出");
				System.out.println("        4.退出系统\n");
				System.out.println("请输入1-4 :");
			
				char selection= Utility.readMenuSelection();
				//获取选择
				switch(selection) {
				
				case '1':
					//System.out.println("-----------------------------");
					System.out.println("--------当前收支细明-------------");
					System.out.println("收支 \t账户金额 \t收支金额 \t备    注\n");
					System.out.println(dataall);
					System.out.println("-----------------------------");
					break;
					
				case '2':
					System.out.println("本次收支金额:");
					int money = Utility.readNumber();
					System.out.println("本次收支说明:");
					String info =Utility.readString();
					
					//
					balance+=money;
					
					//处理dataall
					dataall +="收入\t"+balance+"\t"+money+"\t"+info+"\n";
					//
					System.out.println("-----------登记成功-------------");
					
					//System.out.println("2.登记收入");
					break;
				case '3':
					System.out.println("本次支出金额:");
					int Money = Utility.readNumber();
					System.out.println("本次收支说明:");
					String Info =Utility.readString();
					
					//
					balance-=Money;
					//处理dataall
					dataall +="支出\t"+balance+"\t"+Money+"\t"+Info+"\n";
					System.out.println("-----------登记成功-------------");

					//System.out.println("3.支出");
					break;
				case '4':
					
					
					//System.out.println("4.退出成功");
					System.out.println("确认是否推出（y/n）");
					char isExit= Utility.readConfirmSelection();
					if(isExit=='Y') {
						
						isFlag=false;
						System.out.println("     退出成功");
						
					}
					
				}
				
		 }
	}
}
