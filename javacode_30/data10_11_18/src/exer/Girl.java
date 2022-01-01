package exer;

public class Girl {

	private String name;
	private int age;

	// 构造器的使用
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
		System.out.println("我想嫁给" + boy.getName());

		// this 表示当前对象
		boy.marry(this);

	}

	// 比较
	/**
	 * 
	 * @param girl
	 * @return 返回的是比较大小
	 */
	public int compare(Girl girl) {
		
		return girl.age-this.age;
			//左到右运行
	}
}
