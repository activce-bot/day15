package exer1;

/*	声明异常
 * 手动抛出异常throw
 */
public class ExceptionTest2 {

	public static void main(String[] args) {

		Student student = new Student();
		try {
			student.setId(-100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(student.getId());

	}
}

class Student {

	private int id;

	public int getId() {
		return id;
	}
 
	public void setId(int id) throws Exception {
		if (id > 0) {
			this.id = id;
		} else {
			// System.out.println("你输出的数据有误！");
			throw new RuntimeException("您输入的数 据非法");
		}

	}
}
