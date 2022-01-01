package exer;

public class BoyGirTest {
	public static void main(String[] args) {
		
		Boy boy=new Boy("gxx",18);
		
		Girl girl =new Girl("ggg", 19);
		
		
		girl.marry(boy);
		
		Girl girl1=new Girl("caixk",20);
		
		System.out.println(girl.compare(girl1));
		
		
	}
	
}
