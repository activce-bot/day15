
//求某月某天在莫年的第几天

package data4;
import java.util.Scanner;
public class Switch_case {
	public static void main (String[] args) {
		
		//Scan 实例化
		Scanner scan =new Scanner(System.in);
		
		System.out.println("输入年份");
		int year=scan.nextInt();
		
		System.out.println("输入日期mouth");
		int mouth= scan.nextInt();
		
		System.out.println("输入日期data");
		int data= scan.nextInt();
		
		int alldata=0;
		switch(mouth) {
		
		case 12:
			alldata+=30;
		case 11:
			alldata+=31;
		case 10:
			alldata+=30;
		case 9:
			alldata+=31;
		case 8:
			alldata+=31;
		case 7:
			alldata+=30;
		case 6:
			alldata+=31;
		case 5:
			alldata+=30;
		case 4:
			alldata+=31;
		case 3:
			if((year%100 !=0 && year%4 ==0)|year%400==0) {
				alldata+=28;
			}else {
				alldata+=29;
			}
		case 2:
			alldata+=31;
		case 1:
			alldata=data+alldata;
			System.out.println(mouth+"月"+data+"号为一年中的第"+alldata+"天");
			break;
		default:
			System.out.println("输入的月份不合法");
			
		}
	}
}	