package exer;

public class Girl {

	private String name;
	private int age;

	// ��������ʹ��
	public Girl() {
		
	}
	
	public Girl(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void marry(Boy boy) {
		System.out.println("����޸�" + boy.getName());

		// this ��ʾ��ǰ����
		boy.marry(this);

	}

	// �Ƚ�
	/**
	 * 
	 * @param girl
	 * @return ���ص��ǱȽϴ�С
	 */
	public int compare(Girl girl) {
		
		return girl.age-this.age;
			//��������
	}
}
