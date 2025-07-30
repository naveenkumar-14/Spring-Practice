import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScopes {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("Beans.xml");
		Employee emp1=ac.getBean(Employee.class);
		System.out.println(emp1);
		Employee emp2=ac.getBean(Employee.class);
		System.out.println(emp2 );
	}
}
