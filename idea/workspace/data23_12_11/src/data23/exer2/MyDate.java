package data23.exer2;

/**
 * @author gjx
 * @create 2021-12-12 14:23
 */

import java.util.Objects;

/**
 * MyDate 类包含:
 private 成员变量 year,month,day；并为每一个属性定义 getter, setter方法；
 */
public class MyDate implements Comparable{
    private int year;
    private int month;
    private int day;

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public void setYear(int year){
        this.year=year;
    }

    public int getYear() {
        return year;
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

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year &&
                month == myDate.month &&
                day == myDate.day;
    }

    @Override
    public int hashCode() {

        return Objects.hash(year, month, day);
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof MyDate){
            MyDate e =(MyDate)o;
            int minyear = this.getYear() - e.getYear();
            if(minyear!=0){
                return minyear;
            }
            int minMonth = this.getMonth() - e.getMonth();
            if(minMonth!=0){
                return minMonth;
            }
            int minday = this.getDay() - e.getDay();
            if(minday!=0){
                return minday;
            }
        }
        throw new RuntimeException("输入的数据异常");
    }
}
