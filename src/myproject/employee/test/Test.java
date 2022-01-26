package myproject.employee.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import myproject.employee.pojo.Employee;

public class Test {

	public static void main(String[] args) throws Exception{
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee emp = new Employee();
		emp.setEno(1);
		emp.setEname("Tofique");
		emp.setEsal(19500);
		emp.setEaddr("Indore");
		
		int eno = (Integer)session.save(emp);
		System.out.println(eno);
		transaction.commit();
		session.close();
		sessionFactory.close();
		
		
		
	}
}
