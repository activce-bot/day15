package exer1;

public class ComparableCircle extends Circle implements Comparable {

	public ComparableCircle(Double redius) {
		super(redius);
	}
	/**
	 * 
	 * @return//若返回值是 0 , 代表相等; 若为正数，代表当前对象大；负数代表当前对象小
	 */
	@Override
	public int compareTo(Object o) {

		if (this == o) {
			return 0;
		}
		if (o instanceof ComparableCircle) {
			// 强制转型
			ComparableCircle c = (ComparableCircle) o;
			if (this.getRedius() > c.getRedius()) {
				return 1;
			} else if (this.getRedius() < c.getRedius()) {
				return -1;
			} else {
				return 0;
			}
		}

//		return 0;
		//抛出异常
		throw new RuntimeException("传入的数据类型不匹配");
	}

}
