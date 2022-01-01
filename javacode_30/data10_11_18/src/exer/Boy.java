package exer;

public class Boy {
	private String name;
	private int age;
	
	public Boy(String name, int age) {
		this.age=age;
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void marry(Girl girl) {
		System.out.println("Œ“œÎ»¢"+girl.getName());
	}
	public void shout() {
		
	}
	

}
