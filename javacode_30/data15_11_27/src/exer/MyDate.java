package exer;

/**
 * private成员变量year,month,day ； toDateString()方法返回日期对应的字符串：xxxx年xx月xx日
 * 
 * @Description
 * @author gjx Email:3118600260@qq.com
 * @version
 * @date 2021年11月27日上午11:04:15
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
	
	//返回生日
	@Override
	public String toString() {
		return year + "年" + month + "月" + day + "天";
	}

}
