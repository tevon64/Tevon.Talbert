 package Com.Revature;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

	  
public class LaunchPad extends HibernateSessionFactory {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	try {
		sessionFactory = new Configuration().configure()
				.setProperty("hibernate.connection.url","jdbc:postgresql://database-3.clzirnqm0xdy.us-east-2.rds.amazonaws.com:5432/Database35")
				.setProperty("hibernate.connection.username", "postgres")
				.setProperty("hibernate.connection.password", "Rammstein1")
				.buildSessionFactory();
		System.out.println("Good to go");
	}catch(HibernateException e) {
		e.printStackTrace();
	}
	
return;
	}

	 
//Getters and setters
}
	

	










