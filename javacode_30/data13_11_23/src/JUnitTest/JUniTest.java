package JUnitTest;
/**
 * JUnit ����
* @Description
* @author gjx Email:3118600260@qq.com
* @version
* @date 2021��11��23������7:56:29
*
 */

import org.junit.Test;

public class JUniTest {
	
	int mub=10;
	
	@Test
	public void testEquals() {
		String s1="mm";
		String s2="mm";
		System.out.println(s1.equals(s2));
		
		System.out.println(mub);
		
	}
	
	@Test
	public void testEquals1() {
		mub=20;
		System.out.println(mub);
		
	}
	
	
}
