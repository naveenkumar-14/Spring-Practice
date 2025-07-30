
public class Student {
	static Student s;
//	static {
//		
//	}
	public static Student getObject() {
		if(s==null) {
			s=new Student();
		}
		
		return s;
	}
	private Student() {
		// TODO Auto-generated constructor stub
	}
	
}
