package exer1;

public class ComparableCircle extends Circle implements Comparable {

	public ComparableCircle(Double redius) {
		super(redius);
	}
	/**
	 * 
	 * @return//������ֵ�� 0 , �������; ��Ϊ����������ǰ����󣻸�������ǰ����С
	 */
	@Override
	public int compareTo(Object o) {

		if (this == o) {
			return 0;
		}
		if (o instanceof ComparableCircle) {
			// ǿ��ת��
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
		//�׳��쳣
		throw new RuntimeException("������������Ͳ�ƥ��");
	}

}
