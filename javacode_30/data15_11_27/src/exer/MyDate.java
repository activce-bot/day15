package exer;

/**
 * private��Ա����year,month,day �� toDateString()�����������ڶ�Ӧ���ַ�����xxxx��xx��xx��
 * 
 * @Description
 * @author gjx Email:3118600260@qq.com
 * @version
 * @date 2021��11��27������11:04:15
 *
 */
public class MyDate {
	private int year;
	private int month;
	private int day;
	
	

	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
	//��������
	@Override
	public String toString() {
		return year + "��" + month + "��" + day + "��";
	}

}
